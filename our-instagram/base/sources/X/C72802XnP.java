package X;

import android.os.Bundle;

/* renamed from: X.XnP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72802XnP {
    public final int A00;
    public final Bundle A01;
    public final CharSequence A02;
    public final String A03;
    public final java.util.Set A04;
    public final boolean A05;
    public final CharSequence[] A06;

    public C72802XnP(Bundle bundle, CharSequence charSequence, String str, java.util.Set set, CharSequence[] charSequenceArr, int i, boolean z) {
        this.A03 = str;
        this.A02 = charSequence;
        this.A06 = charSequenceArr;
        this.A05 = z;
        this.A00 = i;
        this.A01 = bundle;
        this.A04 = set;
        if (i == 2 && !z) {
            throw AbstractC166987dD.A12("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }
}
