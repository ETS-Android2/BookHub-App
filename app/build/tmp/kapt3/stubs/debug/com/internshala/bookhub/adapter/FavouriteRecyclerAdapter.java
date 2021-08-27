package com.internshala.bookhub.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/internshala/bookhub/adapter/FavouriteRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/internshala/bookhub/adapter/FavouriteRecyclerAdapter$FavouriteViewHolder;", "context", "Landroid/content/Context;", "bookList", "", "Lcom/internshala/bookhub/database/BookEntity;", "(Landroid/content/Context;Ljava/util/List;)V", "getBookList", "()Ljava/util/List;", "getContext", "()Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FavouriteViewHolder", "app_debug"})
public final class FavouriteRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.internshala.bookhub.adapter.FavouriteRecyclerAdapter.FavouriteViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.internshala.bookhub.database.BookEntity> bookList = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.internshala.bookhub.adapter.FavouriteRecyclerAdapter.FavouriteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.internshala.bookhub.adapter.FavouriteRecyclerAdapter.FavouriteViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.internshala.bookhub.database.BookEntity> getBookList() {
        return null;
    }
    
    public FavouriteRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.internshala.bookhub.database.BookEntity> bookList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/internshala/bookhub/adapter/FavouriteRecyclerAdapter$FavouriteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "imgBookImage", "Landroid/widget/ImageView;", "getImgBookImage", "()Landroid/widget/ImageView;", "llContent", "Landroid/widget/LinearLayout;", "getLlContent", "()Landroid/widget/LinearLayout;", "txtBookAuthor", "Landroid/widget/TextView;", "getTxtBookAuthor", "()Landroid/widget/TextView;", "txtBookName", "getTxtBookName", "txtBookPrice", "getTxtBookPrice", "txtBookRating", "getTxtBookRating", "app_debug"})
    public static final class FavouriteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txtBookName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txtBookAuthor = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txtBookPrice = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView txtBookRating = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView imgBookImage = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout llContent = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtBookName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtBookAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtBookPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtBookRating() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgBookImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlContent() {
            return null;
        }
        
        public FavouriteViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}