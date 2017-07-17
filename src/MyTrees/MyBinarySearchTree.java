/*
 * Copyright (C) 2017 Denise
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package MyTrees;

import Models.TreeNode;

/**
 *
 * @author Denise
 */
public class MyBinarySearchTree implements IBinarySearchTree
{
    
    private TreeNode Root;
    
    @Override
    public TreeNode GetRoot()
    {
        return Root;
    
    }
    
    
    private TreeNode CreateNode(int data)
    {
        TreeNode node = new TreeNode();
        node.setValue(data);
        return node;
    
    }

        
    @Override
    public void Add(int data) 
    {
        if(Root == null)
        {
            Root = CreateNode(data);
        }
        else
        {
            Add(Root, data);
        } 
    }

    
    private void Add(TreeNode currentNode, int data)
    {
        // current node value is greater than the data.
        //this means data is lesser, so should be on the left
        if(currentNode.getValue() > data)
        {
            if(currentNode.getLeft() == null)
            {
                currentNode.setLeft(CreateNode(data));
            }else
            {
                Add(currentNode.getLeft(), data);
            }
        }
        else
        {
            if(currentNode.getRight() == null)
            {
                currentNode.setRight(CreateNode(data));
            }else
            {
                Add(currentNode.getRight(), data);
            }
        }
        
    }
    
    private void Visit(TreeNode currentNode)
    {
        System.out.println("Current value: " + currentNode.getValue());
        if(currentNode.getLeft() != null)
            System.out.println("\tLeft value: " + currentNode.getLeft().getValue());
        if(currentNode.getRight() != null)
            System.out.println("\tRight value: " + currentNode.getRight().getValue());
    }

    @Override
    public boolean Remove(int data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InOrderTraversal(TreeNode node) 
    {
        if(node != null)
        {
            InOrderTraversal(node.getLeft());
            Visit(node);
            InOrderTraversal(node.getRight());
        }
    }

    @Override
    public boolean PreOrderTraversal(int data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean PostOrderTraversal(int data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override 
    public void ToString()
    {
        InOrderTraversal(Root);
    
    }
    
}
