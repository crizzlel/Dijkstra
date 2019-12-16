package com.company;

public class Main {

    public static void main(String[] args) {

        Node node0 = new Node("0");
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        Node node5 = new Node("5");
        Node node6 = new Node("6");
        Node node7 = new Node("7");
        Node node8 = new Node("8");
        Node node9 = new Node("9");
        Node node10 = new Node("10");
        Node node11 = new Node("11");
        Node node12 = new Node("12");
        Node node13 = new Node("13");
        Node node14 = new Node("14");
        Node node15 = new Node("15");

        node0.addDestination(node1, 7);
        node0.addDestination(node2, 3);
        node0.addDestination(node3, 8);
        node0.addDestination(node7, 2);
        node0.addDestination(node15, 12);

        node1.addDestination(node3, 2);

        node2.addDestination(node1, 7);
        node2.addDestination(node3, 2);
        node2.addDestination(node4, 12);
        node2.addDestination(node13, 3);

        node4.addDestination(node7, 4);

        node5.addDestination(node1, 2);
        node5.addDestination(node2, 5);
        node5.addDestination(node3, 3);

        node6.addDestination(node1, 16);

        node7.addDestination(node3, 11);
        node7.addDestination(node6, 5);

        node8.addDestination(node9, 4);
        node8.addDestination(node10, 13);
        node8.addDestination(node13, 2);

        node9.addDestination(node11, 10);
        node9.addDestination(node13, 12);
        node9.addDestination(node14, 16);

        node10.addDestination(node9, 6);
        node10.addDestination(node14, 2);
        node10.addDestination(node15, 15);

        node11.addDestination(node12, 11);
        node11.addDestination(node14, 13);

        node12.addDestination(node3, 7);

        node13.addDestination(node11, 1);
        node13.addDestination(node14, 2);

        node14.addDestination(node1, 9);

        node15.addDestination(node9, 11);
        node15.addDestination(node11, 7);

        Graph graph = new Graph();

        graph.addNode(node0);
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addNode(node5);
        graph.addNode(node6);
        graph.addNode(node7);
        graph.addNode(node8);
        graph.addNode(node9);
        graph.addNode(node10);
        graph.addNode(node11);
        graph.addNode(node12);
        graph.addNode(node13);
        graph.addNode(node14);
        graph.addNode(node15);

        graph = Dijkstra.calculateShortestPathFromSource(graph, node0);

        System.out.println(node0.getDistance());
        System.out.println(node1.getDistance());
        System.out.println(node2.getDistance());
        System.out.println(node3.getDistance());
        System.out.println(node4.getDistance());
        System.out.println(node5.getDistance());
        System.out.println(node6.getDistance());
        System.out.println(node7.getDistance());
        System.out.println(node8.getDistance());
        System.out.println(node9.getDistance());
        System.out.println(node10.getDistance());
        System.out.println(node11.getDistance());
        System.out.println(node12.getDistance());
        System.out.println(node13.getDistance());
        System.out.println(node14.getDistance());
        System.out.println(node15.getDistance());
    }
}
