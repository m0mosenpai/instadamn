package X;

import android.app.Activity;
import android.content.Context;
import android.text.ClipboardManager;
import android.view.View;

/* renamed from: X.Fsl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35871Fsl implements C2n2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C35871Fsl(Activity activity, View view, int i, boolean z) {
        this.A00 = i;
        this.A01 = activity;
        this.A03 = z;
        this.A02 = view;
    }

    @Override // X.C2n2
    public final Object apply(Object obj) {
        int i = this.A00;
        Context context = (Context) this.A01;
        boolean z = this.A03;
        View view = (View) this.A02;
        String str = (String) obj;
        if (i != 0) {
            ((ClipboardManager) AbstractC31171DnF.A0X(context)).setText(str);
        } else {
            AbstractC13900nG.A00(context, str);
        }
        AbstractC34301FAv.A00(context, view, null, z);
        return null;
    }
}
