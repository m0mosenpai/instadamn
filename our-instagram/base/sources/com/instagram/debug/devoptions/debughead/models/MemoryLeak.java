package com.instagram.debug.devoptions.debughead.models;

import X.AbstractC166987dD;
import X.AbstractC25226BEj;
import X.AbstractC53242c7;
import X.AbstractC58320PtC;
import X.AbstractC64514THh;
import X.C0He;
import X.C64911TZl;
import X.MSY;
import android.content.Context;
import com.facebook.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public class MemoryLeak {
    public final List mActiveReferenceList;
    public final Set mAnalysisResultSet;
    public AnalysisStatus mAnalysisStatus;
    public final List mAnalyzedReferenceList;
    public final String mClassName;
    public int mCount;
    public final String mPath;
    public final List mQueuedReferenceList;

    /* loaded from: classes10.dex */
    public enum AnalysisStatus {
        NO_OP,
        NOT_REQUESTED,
        REQUESTED,
        FAILED,
        COMPLETED,
        PARTIAL
    }

    /* renamed from: com.instagram.debug.devoptions.debughead.models.MemoryLeak$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$instagram$debug$devoptions$debughead$models$MemoryLeak$AnalysisStatus;

        static {
            int[] iArr = new int[AnalysisStatus.values().length];
            $SwitchMap$com$instagram$debug$devoptions$debughead$models$MemoryLeak$AnalysisStatus = iArr;
            try {
                MSY.A1I(AnalysisStatus.REQUESTED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                MSY.A1J(AnalysisStatus.COMPLETED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MSY.A1K(AnalysisStatus.PARTIAL, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MSY.A1L(AnalysisStatus.FAILED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void addActiveReference(Object obj, ReferenceQueue referenceQueue) {
        this.mActiveReferenceList.add(new WeakReference(obj, referenceQueue));
    }

    public void addAnalysisResult(AbstractC64514THh abstractC64514THh) {
        this.mAnalysisResultSet.add(abstractC64514THh);
    }

    public void clearNullReferences() {
        int A05 = AbstractC25226BEj.A05(this.mActiveReferenceList);
        int size = this.mQueuedReferenceList.size();
        while (true) {
            size--;
            if (A05 < 0) {
                if (size < 0) {
                    return;
                }
            } else {
                if (((Reference) this.mActiveReferenceList.get(A05)).get() == null) {
                    this.mActiveReferenceList.remove(A05);
                }
                if (size < 0) {
                    A05--;
                }
            }
            if (((Reference) this.mQueuedReferenceList.get(A05)).get() == null) {
                this.mQueuedReferenceList.remove(A05);
            }
            A05--;
        }
    }

    public int decrementCount() {
        int i = this.mCount - 1;
        this.mCount = i;
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0He, java.util.ArrayList] */
    public C0He getActiveReferences() {
        return new ArrayList(this.mActiveReferenceList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, X.TZl] */
    public C64911TZl getAnalysisResults() {
        return new HashSet(this.mAnalysisResultSet);
    }

    public AnalysisStatus getAnalysisStatus() {
        return this.mAnalysisStatus;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0He, java.util.ArrayList] */
    public C0He getAnalyzedReferences() {
        return new ArrayList(this.mAnalyzedReferenceList);
    }

    public String getClassName() {
        return this.mClassName;
    }

    public int getCount() {
        return this.mCount;
    }

    public WeakReference getLastAddedActiveReference() {
        return (WeakReference) AbstractC58320PtC.A0u(this.mActiveReferenceList);
    }

    public String getPath() {
        return this.mPath;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0He, java.util.ArrayList] */
    public C0He getQueuedReferences() {
        return new ArrayList(this.mQueuedReferenceList);
    }

    public int getStatusColor(Context context) {
        int i;
        int ordinal = this.mAnalysisStatus.ordinal();
        if (ordinal != 2) {
            if (ordinal != 4) {
                if (ordinal != 5) {
                    i = R.attr.igds_color_gradient_red;
                    if (ordinal != 3) {
                        i = R.attr.igds_color_stroke;
                    }
                } else {
                    return R.color.igds_gradient_cyan;
                }
            } else {
                return R.color.igds_active_badge;
            }
        } else {
            i = R.attr.igds_color_gradient_yellow;
        }
        return AbstractC53242c7.A0H(context, i);
    }

    public void incrementCount() {
        this.mCount++;
    }

    public void moveReferencesBackFromQueued() {
        this.mActiveReferenceList.addAll(this.mQueuedReferenceList);
        this.mQueuedReferenceList.clear();
    }

    public void moveReferencesToAnalyzed() {
        this.mAnalyzedReferenceList.addAll(this.mQueuedReferenceList);
        this.mQueuedReferenceList.clear();
    }

    public void moveReferencesToQueued() {
        this.mQueuedReferenceList.addAll(this.mActiveReferenceList);
        this.mActiveReferenceList.clear();
    }

    public MemoryLeak(Object obj, String str, String str2, ReferenceQueue referenceQueue) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.mActiveReferenceList = A1E;
        this.mQueuedReferenceList = AbstractC166987dD.A1E();
        this.mAnalyzedReferenceList = AbstractC166987dD.A1E();
        this.mAnalysisResultSet = AbstractC166987dD.A1H();
        A1E.add(new WeakReference(obj, referenceQueue));
        this.mPath = str;
        this.mClassName = str2;
        this.mAnalysisStatus = AnalysisStatus.NOT_REQUESTED;
        this.mCount = 1;
    }

    public void setAnalysisStatus(AnalysisStatus analysisStatus) {
        this.mAnalysisStatus = analysisStatus;
    }
}
