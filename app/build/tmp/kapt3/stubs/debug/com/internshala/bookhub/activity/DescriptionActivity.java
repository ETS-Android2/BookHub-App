package com.internshala.bookhub.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001=B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u001a\u00100\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u001a\u00103\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R\u001a\u00106\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,\u00a8\u0006>"}, d2 = {"Lcom/internshala/bookhub/activity/DescriptionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "bookId", "", "getBookId", "()Ljava/lang/String;", "setBookId", "(Ljava/lang/String;)V", "btnAddToFav", "Landroid/widget/Button;", "getBtnAddToFav", "()Landroid/widget/Button;", "setBtnAddToFav", "(Landroid/widget/Button;)V", "imgBookImage", "Landroid/widget/ImageView;", "getImgBookImage", "()Landroid/widget/ImageView;", "setImgBookImage", "(Landroid/widget/ImageView;)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "progressLayout", "Landroid/widget/RelativeLayout;", "getProgressLayout", "()Landroid/widget/RelativeLayout;", "setProgressLayout", "(Landroid/widget/RelativeLayout;)V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "txtBookAuthor", "Landroid/widget/TextView;", "getTxtBookAuthor", "()Landroid/widget/TextView;", "setTxtBookAuthor", "(Landroid/widget/TextView;)V", "txtBookDesc", "getTxtBookDesc", "setTxtBookDesc", "txtBookName", "getTxtBookName", "setTxtBookName", "txtBookPrice", "getTxtBookPrice", "setTxtBookPrice", "txtBookRating", "getTxtBookRating", "setTxtBookRating", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "DBAsyncTask", "app_debug"})
public final class DescriptionActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView txtBookName;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView txtBookAuthor;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView txtBookPrice;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView txtBookRating;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView imgBookImage;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView txtBookDesc;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button btnAddToFav;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ProgressBar progressBar;
    @org.jetbrains.annotations.NotNull()
    public android.widget.RelativeLayout progressLayout;
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.widget.Toolbar toolbar;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String bookId = "100";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTxtBookName() {
        return null;
    }
    
    public final void setTxtBookName(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTxtBookAuthor() {
        return null;
    }
    
    public final void setTxtBookAuthor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTxtBookPrice() {
        return null;
    }
    
    public final void setTxtBookPrice(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTxtBookRating() {
        return null;
    }
    
    public final void setTxtBookRating(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getImgBookImage() {
        return null;
    }
    
    public final void setImgBookImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTxtBookDesc() {
        return null;
    }
    
    public final void setTxtBookDesc(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtnAddToFav() {
        return null;
    }
    
    public final void setBtnAddToFav(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getProgressLayout() {
        return null;
    }
    
    public final void setProgressLayout(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBookId() {
        return null;
    }
    
    public final void setBookId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public DescriptionActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ%\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0017\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/internshala/bookhub/activity/DescriptionActivity$DBAsyncTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "context", "Landroid/content/Context;", "bookEntity", "Lcom/internshala/bookhub/database/BookEntity;", "mode", "", "(Landroid/content/Context;Lcom/internshala/bookhub/database/BookEntity;I)V", "getBookEntity", "()Lcom/internshala/bookhub/database/BookEntity;", "getContext", "()Landroid/content/Context;", "db", "Lcom/internshala/bookhub/database/BookDatabase;", "getDb", "()Lcom/internshala/bookhub/database/BookDatabase;", "getMode", "()I", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/lang/Boolean;", "app_debug"})
    public static final class DBAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
        @org.jetbrains.annotations.NotNull()
        private final com.internshala.bookhub.database.BookDatabase db = null;
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final com.internshala.bookhub.database.BookEntity bookEntity = null;
        private final int mode = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.internshala.bookhub.database.BookDatabase getDb() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... p0) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.internshala.bookhub.database.BookEntity getBookEntity() {
            return null;
        }
        
        public final int getMode() {
            return 0;
        }
        
        public DBAsyncTask(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.internshala.bookhub.database.BookEntity bookEntity, int mode) {
            super();
        }
    }
}