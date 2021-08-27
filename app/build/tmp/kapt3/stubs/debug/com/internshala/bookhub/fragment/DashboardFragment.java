package com.internshala.bookhub.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J&\u00102\u001a\u0004\u0018\u0001032\u0006\u00100\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006="}, d2 = {"Lcom/internshala/bookhub/fragment/DashboardFragment;", "Landroidx/fragment/app/Fragment;", "()V", "bookInfoList", "Ljava/util/ArrayList;", "Lcom/internshala/bookhub/model/Book;", "getBookInfoList", "()Ljava/util/ArrayList;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "setLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "progressLayout", "Landroid/widget/RelativeLayout;", "getProgressLayout", "()Landroid/widget/RelativeLayout;", "setProgressLayout", "(Landroid/widget/RelativeLayout;)V", "ratingComparator", "Ljava/util/Comparator;", "getRatingComparator", "()Ljava/util/Comparator;", "setRatingComparator", "(Ljava/util/Comparator;)V", "recyclerAdapter", "Lcom/internshala/bookhub/adapter/DashboardRecyclerAdapter;", "getRecyclerAdapter", "()Lcom/internshala/bookhub/adapter/DashboardRecyclerAdapter;", "setRecyclerAdapter", "(Lcom/internshala/bookhub/adapter/DashboardRecyclerAdapter;)V", "recyclerDashboard", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDashboard", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDashboard", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_debug"})
public final class DashboardFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView recyclerDashboard;
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
    @org.jetbrains.annotations.NotNull()
    public com.internshala.bookhub.adapter.DashboardRecyclerAdapter recyclerAdapter;
    @org.jetbrains.annotations.NotNull()
    public android.widget.RelativeLayout progressLayout;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ProgressBar progressBar;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.internshala.bookhub.model.Book> bookInfoList = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.Comparator<com.internshala.bookhub.model.Book> ratingComparator;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerDashboard() {
        return null;
    }
    
    public final void setRecyclerDashboard(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.LayoutManager getLayoutManager() {
        return null;
    }
    
    public final void setLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.internshala.bookhub.adapter.DashboardRecyclerAdapter getRecyclerAdapter() {
        return null;
    }
    
    public final void setRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.internshala.bookhub.adapter.DashboardRecyclerAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getProgressLayout() {
        return null;
    }
    
    public final void setProgressLayout(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.internshala.bookhub.model.Book> getBookInfoList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Comparator<com.internshala.bookhub.model.Book> getRatingComparator() {
        return null;
    }
    
    public final void setRatingComparator(@org.jetbrains.annotations.NotNull()
    java.util.Comparator<com.internshala.bookhub.model.Book> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public DashboardFragment() {
        super();
    }
}