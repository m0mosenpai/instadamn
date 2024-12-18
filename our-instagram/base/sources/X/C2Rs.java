package X;

/* renamed from: X.2Rs, reason: invalid class name */
/* loaded from: classes.dex */
public interface C2Rs {
    int dumpJavaHeap(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, StringBuilder sb);

    int dumpJavaHeapAsync(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, StringBuilder sb, boolean z);

    void initialize(boolean z, boolean z2, int i);

    void prepareForDump(C2SC c2sc, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4);

    int waitForDump(StringBuilder sb);
}
