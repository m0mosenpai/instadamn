package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.EUn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32537EUn extends C1P1 {
    public static final Map A05 = AbstractC25233BEq.A0p("/share/stories/", C37090GVz.A00, AbstractC166987dD.A1L("/share/reel/", C37089GVy.A00));
    public final Activity A00;
    public final Context A01;
    public final Intent A02;
    public final Bundle A03;
    public final String A04;

    public C32537EUn(Activity activity, Context context, Intent intent, Bundle bundle, String str) {
        this.A00 = activity;
        this.A01 = context;
        this.A04 = str;
        this.A02 = intent;
        this.A03 = bundle;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        int A03 = C0f9.A03(-1670257072);
        C14360o3.A0B(abstractC115105If, 0);
        super.onFail(abstractC115105If);
        Iterator A15 = AbstractC166997dE.A15(A05);
        while (true) {
            if (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                if (AbstractC001900j.A0a(this.A04, (CharSequence) A1K.getKey(), false)) {
                    Intent A04 = AbstractC31171DnF.A04();
                    Context context = this.A01;
                    A04.setClassName(context, "com.instagram.url.UrlHandlerActivity");
                    A04.setData(AbstractC08820cl.A03((String) ((InterfaceC16660sJ) A1K.getValue()).invoke(this.A02)));
                    A04.setFlags(67108864);
                    C12260kU.A0C(context, A04);
                    this.A00.finish();
                    i = -1289810698;
                    break;
                }
            } else {
                C45116Jxl c45116Jxl = (C45116Jxl) abstractC115105If.A00();
                if (c45116Jxl != null && c45116Jxl.A00 != null) {
                    C9GR.A0E(AbstractC12290kX.A00, "link_revamp_network_error");
                }
                android.net.Uri A0B = AbstractC25227BEk.A0B(this.A04);
                Bundle bundle = this.A03;
                AbstractC31178DnM.A0q(A0B, bundle, "mainfeed");
                Activity activity = this.A00;
                AbstractC35275FhA.A03(activity, bundle);
                activity.finish();
                i = -318980579;
            }
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(235779962);
        C45116Jxl c45116Jxl = (C45116Jxl) obj;
        int A0N = AbstractC167017dG.A0N(c45116Jxl, 250103944);
        super.onSuccess(c45116Jxl);
        String str = c45116Jxl.A01;
        if (str != null) {
            Intent A04 = AbstractC31171DnF.A04();
            Context context = this.A01;
            A04.setClassName(context, "com.instagram.url.UrlHandlerActivity");
            A04.setData(AbstractC08820cl.A03(str));
            A04.setFlags(67108864);
            C12260kU.A0C(context, A04);
            this.A00.finish();
        }
        C0f9.A0A(230676242, A0N);
        C0f9.A0A(-1005841962, A03);
    }
}
