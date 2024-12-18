package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3OO, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3OO {
    public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
    public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
    public static final int FLAG_BOUND = 1;
    public static final int FLAG_IGNORE = 128;
    public static final int FLAG_INVALID = 4;
    public static final int FLAG_MOVED = 2048;
    public static final int FLAG_NOT_RECYCLABLE = 16;
    public static final int FLAG_REMOVED = 8;
    public static final int FLAG_RETURNED_FROM_SCRAP = 32;
    public static final int FLAG_TMP_DETACHED = 256;
    public static final int FLAG_UPDATE = 2;
    public static final List FULLUPDATE_PAYLOADS = Collections.emptyList();
    public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
    public final View itemView;
    public C2UU mBindingAdapter;
    public int mFlags;
    public WeakReference mNestedRecyclerView;
    public RecyclerView mOwnerRecyclerView;
    public int mPosition = -1;
    public int mOldPosition = -1;
    public long mItemId = -1;
    public int mItemViewType = -1;
    public int mPreLayoutPosition = -1;
    public C3OO mShadowedHolder = null;
    public C3OO mShadowingHolder = null;
    public List mPayloads = null;
    public List mUnmodifiedPayloads = null;
    public int mIsRecyclableCount = 0;
    public C70593Ew mScrapContainer = null;
    public boolean mInChangeScrap = false;
    public int mWasImportantForAccessibilityBeforeHidden = 0;
    public int mPendingAccessibilityState = -1;

    public void clearOldPosition() {
        this.mOldPosition = -1;
        this.mPreLayoutPosition = -1;
    }

    public final void setIsRecyclable(boolean z) {
        int i;
        int i2 = this.mIsRecyclableCount;
        int i3 = i2 + 1;
        if (z) {
            i3 = i2 - 1;
        }
        this.mIsRecyclableCount = i3;
        if (i3 < 0) {
            this.mIsRecyclableCount = 0;
            boolean z2 = RecyclerView.A1C;
            StringBuilder sb = new StringBuilder();
            sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
            sb.append(this);
            String obj = sb.toString();
            if (!z2) {
                android.util.Log.e("View", obj);
            } else {
                throw new RuntimeException(obj);
            }
        } else if (!z) {
            if (i3 == 1) {
                i = this.mFlags | 16;
                this.mFlags = i;
            }
        } else if (i3 == 0) {
            i = this.mFlags & (-17);
            this.mFlags = i;
        }
        float f = RecyclerView.A1E;
    }

    private void createPayloadsIfNeeded() {
        if (this.mPayloads == null) {
            ArrayList arrayList = new ArrayList();
            this.mPayloads = arrayList;
            this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
        }
    }

    public void addChangePayload(Object obj) {
        if (obj == null) {
            addFlags(1024);
        } else {
            if ((1024 & this.mFlags) != 0) {
                return;
            }
            createPayloadsIfNeeded();
            this.mPayloads.add(obj);
        }
    }

    public void addFlags(int i) {
        this.mFlags = i | this.mFlags;
    }

    public void clearPayload() {
        List list = this.mPayloads;
        if (list != null) {
            list.clear();
        }
        this.mFlags &= -1025;
    }

    public void clearReturnedFromScrapFlag() {
        this.mFlags &= -33;
    }

    public void clearTmpDetachFlag() {
        this.mFlags &= -257;
    }

    public boolean doesTransientStatePreventRecycling() {
        if ((this.mFlags & 16) == 0 && this.itemView.hasTransientState()) {
            return true;
        }
        return false;
    }

    public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
        addFlags(8);
        offsetPosition(i2, z);
        this.mPosition = i;
    }

    public final int getAbsoluteAdapterPosition() {
        RecyclerView recyclerView = this.mOwnerRecyclerView;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.A0R(this);
    }

    public final C2UU getBindingAdapter() {
        return this.mBindingAdapter;
    }

    public final int getBindingAdapterPosition() {
        RecyclerView recyclerView;
        C2UU c2uu;
        int A0R;
        C2UU c2uu2 = this.mBindingAdapter;
        if (c2uu2 == null || (recyclerView = this.mOwnerRecyclerView) == null || (c2uu = recyclerView.A0A) == null || (A0R = recyclerView.A0R(this)) == -1) {
            return -1;
        }
        return c2uu.findRelativeAdapterPositionIn(c2uu2, this, A0R);
    }

    public final long getItemId() {
        return this.mItemId;
    }

    public final int getItemViewType() {
        return this.mItemViewType;
    }

    public final int getLayoutPosition() {
        int i = this.mPreLayoutPosition;
        if (i == -1) {
            return this.mPosition;
        }
        return i;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    @Deprecated
    public final int getPosition() {
        int i = this.mPreLayoutPosition;
        if (i == -1) {
            return this.mPosition;
        }
        return i;
    }

    public List getUnmodifiedPayloads() {
        List list;
        if ((this.mFlags & 1024) == 0 && (list = this.mPayloads) != null && list.size() != 0) {
            return this.mUnmodifiedPayloads;
        }
        return FULLUPDATE_PAYLOADS;
    }

    public boolean hasAnyOfTheFlags(int i) {
        if ((i & this.mFlags) == 0) {
            return false;
        }
        return true;
    }

    public boolean isAdapterPositionUnknown() {
        if ((this.mFlags & 512) == 0 && !isInvalid()) {
            return false;
        }
        return true;
    }

    public boolean isAttachedToTransitionOverlay() {
        if (this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView) {
            return true;
        }
        return false;
    }

    public boolean isBound() {
        if ((this.mFlags & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isInvalid() {
        if ((this.mFlags & 4) == 0) {
            return false;
        }
        return true;
    }

    public final boolean isRecyclable() {
        if ((this.mFlags & 16) == 0 && !this.itemView.hasTransientState()) {
            return true;
        }
        return false;
    }

    public boolean isRemoved() {
        if ((this.mFlags & 8) == 0) {
            return false;
        }
        return true;
    }

    public boolean isScrap() {
        if (this.mScrapContainer == null) {
            return false;
        }
        return true;
    }

    public boolean isTmpDetached() {
        if ((this.mFlags & 256) == 0) {
            return false;
        }
        return true;
    }

    public boolean isUpdated() {
        if ((this.mFlags & 2) == 0) {
            return false;
        }
        return true;
    }

    public boolean needsUpdate() {
        if ((this.mFlags & 2) == 0) {
            return false;
        }
        return true;
    }

    public void offsetPosition(int i, boolean z) {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
        int i2 = this.mPreLayoutPosition;
        if (i2 == -1) {
            i2 = this.mPosition;
            this.mPreLayoutPosition = i2;
        }
        if (z) {
            this.mPreLayoutPosition = i2 + i;
        }
        this.mPosition += i;
        if (this.itemView.getLayoutParams() != null) {
            ((C3OP) this.itemView.getLayoutParams()).A00 = true;
        }
    }

    public void onEnteredHiddenState(RecyclerView recyclerView) {
        int i = this.mPendingAccessibilityState;
        if (i == -1) {
            i = this.itemView.getImportantForAccessibility();
        }
        this.mWasImportantForAccessibilityBeforeHidden = i;
        if (recyclerView.A01 > 0) {
            this.mPendingAccessibilityState = 4;
            recyclerView.A13.add(this);
        } else {
            this.itemView.setImportantForAccessibility(4);
        }
    }

    public void onLeftHiddenState(RecyclerView recyclerView) {
        int i = this.mWasImportantForAccessibilityBeforeHidden;
        if (recyclerView.A01 > 0) {
            this.mPendingAccessibilityState = i;
            recyclerView.A13.add(this);
        } else {
            this.itemView.setImportantForAccessibility(i);
        }
        this.mWasImportantForAccessibilityBeforeHidden = 0;
    }

    public void resetInternal() {
        if (RecyclerView.A1C && isTmpDetached()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempting to reset temp-detached ViewHolder: ");
            sb.append(this);
            sb.append(". ViewHolders should be fully detached before resetting.");
            throw new IllegalStateException(sb.toString());
        }
        this.mFlags = 0;
        this.mPosition = -1;
        this.mOldPosition = -1;
        this.mItemId = -1L;
        this.mPreLayoutPosition = -1;
        this.mIsRecyclableCount = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        clearPayload();
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = -1;
        RecyclerView.A0J(this);
    }

    public void saveOldPosition() {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
    }

    public void setFlags(int i, int i2) {
        this.mFlags = (i & i2) | (this.mFlags & (i2 ^ (-1)));
    }

    public void setScrapContainer(C70593Ew c70593Ew, boolean z) {
        this.mScrapContainer = c70593Ew;
        this.mInChangeScrap = z;
    }

    public boolean shouldBeKeptAsChild() {
        if ((this.mFlags & 16) == 0) {
            return false;
        }
        return true;
    }

    public boolean shouldIgnore() {
        if ((this.mFlags & 128) == 0) {
            return false;
        }
        return true;
    }

    public void stopIgnoring() {
        this.mFlags &= -129;
    }

    public void unScrap() {
        this.mScrapContainer.A0D(this);
    }

    public boolean wasReturnedFromScrap() {
        if ((this.mFlags & 32) == 0) {
            return false;
        }
        return true;
    }

    public C3OO(View view) {
        if (view != null) {
            this.itemView = view;
            return;
        }
        throw new IllegalArgumentException(AbstractC43591JPw.A00(1123));
    }

    @Deprecated
    public final int getAdapterPosition() {
        return getBindingAdapterPosition();
    }

    public String toString() {
        String simpleName;
        String str;
        Class<?> cls = getClass();
        if (cls.isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = cls.getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("{");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" position=");
        sb.append(this.mPosition);
        sb.append(" id=");
        sb.append(this.mItemId);
        sb.append(", oldPos=");
        sb.append(this.mOldPosition);
        sb.append(", pLpos:");
        sb.append(this.mPreLayoutPosition);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        if (this.mScrapContainer != null) {
            sb2.append(" scrap ");
            if (this.mInChangeScrap) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb2.append(str);
        }
        if (isInvalid()) {
            sb2.append(" invalid");
        }
        if (!isBound()) {
            sb2.append(" unbound");
        }
        if (needsUpdate()) {
            sb2.append(" update");
        }
        if (isRemoved()) {
            sb2.append(" removed");
        }
        if (shouldIgnore()) {
            sb2.append(" ignored");
        }
        if (isTmpDetached()) {
            sb2.append(" tmpDetached");
        }
        if (!isRecyclable()) {
            sb2.append(AnonymousClass001.A0c(" not recyclable(", ")", this.mIsRecyclableCount));
        }
        if (isAdapterPositionUnknown()) {
            sb2.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
