package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: X.SWp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62908SWp {
    public C6FQ A00;
    public Fragment A01;
    public final Context A02;
    public final C62557SGi A03;

    public static void A00(C62908SWp c62908SWp) {
        C60928Rbi c60928Rbi = new C60928Rbi(c62908SWp, 0);
        Intent flags = AbstractC58318PtA.A0E("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType("image/*").putExtra("android.intent.extra.ALLOW_MULTIPLE", false).setFlags(1);
        try {
            C6BQ.A0K(c62908SWp.A00, c60928Rbi);
            C12260kU.A07(c62908SWp.A01, flags, 1);
        } catch (ActivityNotFoundException e) {
            C62557SGi c62557SGi = c62908SWp.A03;
            C6BQ.A0E(c62557SGi.A00, c62557SGi.A01, AbstractC58319PtB.A1Z(e));
        }
    }

    public C62908SWp(Context context, Fragment fragment, C62557SGi c62557SGi, C6FQ c6fq) {
        this.A01 = fragment;
        this.A02 = context;
        this.A00 = c6fq;
        this.A03 = c62557SGi;
    }
}
