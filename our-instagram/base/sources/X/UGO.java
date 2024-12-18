package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public abstract class UGO extends C8S8 {
    public int mDefaultDragDirs;
    public int mDefaultSwipeDirs;

    @Override // X.C8S8
    public int getMovementFlags(RecyclerView recyclerView, C3OO c3oo) {
        return C8S8.makeMovementFlags(this.mDefaultDragDirs, this.mDefaultSwipeDirs);
    }

    public UGO(int i, int i2) {
        this.mDefaultSwipeDirs = i2;
        this.mDefaultDragDirs = i;
    }

    public int getDragDirs(RecyclerView recyclerView, C3OO c3oo) {
        return this.mDefaultDragDirs;
    }

    public int getSwipeDirs(RecyclerView recyclerView, C3OO c3oo) {
        return this.mDefaultSwipeDirs;
    }

    public void setDefaultDragDirs(int i) {
        this.mDefaultDragDirs = i;
    }

    public void setDefaultSwipeDirs(int i) {
        this.mDefaultSwipeDirs = i;
    }
}
