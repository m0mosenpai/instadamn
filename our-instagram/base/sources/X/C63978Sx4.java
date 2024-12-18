package X;

import android.os.Debug;

/* renamed from: X.Sx4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63978Sx4 implements C2Rs {
    @Override // X.C2Rs
    public final /* synthetic */ void initialize(boolean z, boolean z2, int i) {
    }

    @Override // X.C2Rs
    public final /* synthetic */ void prepareForDump(C2SC c2sc, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
    }

    @Override // X.C2Rs
    public final int dumpJavaHeap(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, StringBuilder sb) {
        Debug.dumpHprofData(charSequence.toString());
        return 0;
    }

    @Override // X.C2Rs
    public final /* synthetic */ int dumpJavaHeapAsync(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, StringBuilder sb, boolean z) {
        Debug.dumpHprofData(charSequence.toString());
        return 0;
    }

    @Override // X.C2Rs
    public final /* synthetic */ int waitForDump(StringBuilder sb) {
        return 0;
    }
}
