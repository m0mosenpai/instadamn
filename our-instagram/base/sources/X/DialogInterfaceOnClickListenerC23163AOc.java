package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.AOc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC23163AOc implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AbstractC59962oe A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C189988bH A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public DialogInterfaceOnClickListenerC23163AOc(AbstractC59962oe abstractC59962oe, UserSession userSession, C189988bH c189988bH, Integer num, String str, String str2, int i, int i2) {
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A05 = num;
        this.A06 = str;
        this.A07 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = c189988bH;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        AbstractC59962oe abstractC59962oe = this.A02;
        C6WQ c6wq = new C6WQ(abstractC59962oe.requireContext(), true);
        c6wq.A00(AbstractC166997dE.A0N(abstractC59962oe).getString(2131969964));
        UserSession userSession = this.A03;
        Integer num = this.A05;
        String str2 = this.A06;
        String str3 = this.A07;
        int i2 = this.A01;
        int i3 = this.A00;
        C14360o3.A0B(num, 1);
        String format = String.format(Locale.US, "music/track/%s/lyrics/report/", AbstractC166997dE.A1b(str2, 1));
        C14360o3.A07(format);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0E = format;
        A0c.A9s("audio_asset_id", str2);
        A0c.A9s("audio_cluster_id", str3);
        if (num.intValue() != 0) {
            str = "misaligned_timestamps";
        } else {
            str = "words_contain_mistakes";
        }
        A0c.A9s(AbstractC111324zv.A00(4452), str);
        A0c.A9s(AbstractC111324zv.A00(740), String.valueOf(i2));
        A0c.A9s("audio_snippet_duration_in_ms", String.valueOf(i3));
        A0c.A0R(C40781ul.class, C55702hA.class);
        C1ON A0N = A0c.A0N();
        A0N.A00 = new MWM(6, this.A04, c6wq);
        abstractC59962oe.schedule(A0N);
    }
}
