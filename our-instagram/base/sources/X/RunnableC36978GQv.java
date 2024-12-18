package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GQv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36978GQv implements Runnable {
    public final /* synthetic */ G3P A00;
    public final /* synthetic */ C160787Im A01;
    public final /* synthetic */ C83403nh A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ WeakReference A04;
    public final /* synthetic */ List A05;

    public RunnableC36978GQv(G3P g3p, C160787Im c160787Im, C83403nh c83403nh, String str, WeakReference weakReference, List list) {
        this.A05 = list;
        this.A02 = c83403nh;
        this.A00 = g3p;
        this.A03 = str;
        this.A01 = c160787Im;
        this.A04 = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        G3P g3p;
        String str;
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            C2JS A0l = AbstractC25225BEi.A0l(it);
            String A0B = A0l.A0B("item_id");
            C83403nh c83403nh = this.A02;
            if (C14360o3.A0K(A0B, c83403nh.A0i())) {
                String A0A = A0l.A0A("error_message");
                if (!C14360o3.A0K(A0A, "SOURCE_AND_TARGET_LANG_SAME") && !C14360o3.A0K(A0A, "UNSUPPORTED_LANG_PAIR") && A0A != null) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A01;
                }
                if (A0l.A0A("error_message") == null) {
                    String A09 = A0l.A09(AbstractC43591JPw.A00(206));
                    g3p = this.A00;
                    FPH fph = g3p.A01;
                    InterfaceC83733oI interfaceC83733oI = g3p.A03;
                    String str2 = this.A03;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(fph.A00, "direct_message_translation_success");
                    if (A0f.isSampled()) {
                        AbstractC31171DnF.A1H(A0f, AbstractC31177DnL.A0f(interfaceC83733oI));
                        A0f.AAP("message_dialect", A09);
                        A0f.AAP("preferred_dialect", str2);
                        A0f.Cht();
                    }
                } else {
                    g3p = this.A00;
                    g3p.A01.A00(g3p.A03, String.valueOf(A0l.A0A("error_message")));
                }
                String A0A2 = A0l.A0A("error_message");
                if (!C14360o3.A0K(A0A2, "SOURCE_AND_TARGET_LANG_SAME") && !C14360o3.A0K(A0A2, "UNSUPPORTED_LANG_PAIR")) {
                    str = A0l.A0C("translated_text");
                } else {
                    str = this.A01.A0e.A1q;
                }
                c83403nh.A1I(str);
                c83403nh.A1H(this.A03);
                if (num.intValue() == 3) {
                    Context context = (Context) this.A04.get();
                    if (context != null) {
                        C146106i8 A0j = AbstractC25229BEm.A0j();
                        A0j.A0H = "translate_message_error";
                        AbstractC25226BEj.A1N(context, A0j, 2131959932);
                        AbstractC31171DnF.A11(context, A0j, 2131959931);
                        AbstractC25233BEq.A1F(A0j);
                    }
                    this.A01.A0b = false;
                } else {
                    this.A01.A0b = true;
                }
                g3p.A00.BT6().EZ9(num, c83403nh.A0i(), true);
            }
        }
    }
}
