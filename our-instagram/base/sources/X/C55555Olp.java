package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Olp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55555Olp implements InterfaceC65626Tpm {
    public C55143Od2 A00;
    public C54503O6g A01;
    public C19L A02;
    public boolean A03;
    public final Integer A04;
    public final InterfaceC19390xP A05;
    public final InterfaceC06180Ui A06;
    public final C47815L9x A07;
    public final UserSession A08;

    public C55555Olp(C47815L9x c47815L9x, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A08 = userSession;
        this.A07 = c47815L9x;
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 10);
        this.A06 = A00;
        this.A05 = MSX.A0r(A00);
        this.A04 = C05F.A01;
    }

    public final void A00(Context context, ViewGroup viewGroup, C50526MSf c50526MSf, String str, C19L c19l) {
        C14360o3.A0B(viewGroup, 1);
        if (this.A03) {
            UserSession userSession = this.A08;
            C18920wW A01 = AbstractC12220kQ.A01(null, userSession);
            O1B.A02 = C03250Di.A00;
            O1B.A01 = A01;
            O1B.A03 = (OT4) OT4.A01.getValue();
            C0JM c0jm = O1B.A02;
            String str2 = "clock";
            if (c0jm != null) {
                O1B.A05 = new O1P(c0jm);
                O1B.A04 = new O1P(c0jm);
                O1B.A06 = true;
                O1B.A00 = str;
                Integer num = C05F.A00;
                O1B.A00(num, this.A04);
                this.A02 = c19l;
                C55143Od2 c55143Od2 = new C55143Od2(context, this.A07, c50526MSf, c19l);
                this.A00 = c55143Od2;
                boolean z = c50526MSf.A01;
                c55143Od2.A07 = userSession;
                str2 = "userSession";
                InterfaceC150356pk A00 = AbstractC149806oZ.A00(userSession);
                c55143Od2.A05 = A00;
                UserSession userSession2 = c55143Od2.A07;
                if (userSession2 != null) {
                    HashMap A012 = C55143Od2.A01(context, c55143Od2, A00, userSession2, false);
                    C224679vs c224679vs = BE2.A01;
                    AnonymousClass818 A002 = C55143Od2.A00(context, c55143Od2);
                    UserSession userSession3 = c55143Od2.A07;
                    if (userSession3 != null) {
                        C150486px c150486px = c55143Od2.A00;
                        if (c150486px == null) {
                            str2 = "effectManagerFactory";
                        } else {
                            BBT bbt = c55143Od2.A03;
                            if (bbt == null) {
                                str2 = "dataProvider";
                            } else {
                                C23326AVl c23326AVl = new C23326AVl(c150486px, bbt, A002, userSession3, false);
                                C14360o3.A0B(c224679vs, 0);
                                A012.put(c224679vs, c23326AVl);
                                C224679vs c224679vs2 = A4I.A0B;
                                C14360o3.A0B(c224679vs2, 0);
                                A012.put(c224679vs2, viewGroup);
                                C224679vs c224679vs3 = A4I.A06;
                                Boolean valueOf = Boolean.valueOf(c55143Od2.A0F.A00);
                                C14360o3.A0B(c224679vs3, 0);
                                C14360o3.A0B(valueOf, 1);
                                A012.put(c224679vs3, valueOf);
                                C224679vs c224679vs4 = A4I.A04;
                                Boolean A0s = AbstractC31172DnG.A0s(z);
                                C14360o3.A0B(c224679vs4, 0);
                                C14360o3.A0B(A0s, 1);
                                A012.put(c224679vs4, A0s);
                                c55143Od2.A0D.A00 = new O1J(c55143Od2);
                                HashMap A1G = AbstractC166987dD.A1G();
                                A1G.putAll(A012);
                                c55143Od2.A04 = new AKN(A1G);
                                AbstractC23641Du.A03(num, AnonymousClass191.A00, new MBq(this, null, 13), c19l);
                                C55143Od2 c55143Od22 = this.A00;
                                if (c55143Od22 == null) {
                                    str2 = "provider";
                                } else {
                                    AKN akn = c55143Od22.A04;
                                    if (akn != null) {
                                        View Bfy = akn.A0E.Bfy();
                                        C14360o3.A07(Bfy);
                                        Bfy.setVisibility(0);
                                    }
                                    if (AbstractC25225BEi.A1Y(str)) {
                                        A01(context, str);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        throw new Exception();
    }

    public final void A01(Context context, String str) {
        C14360o3.A0B(str, 0);
        C55143Od2 c55143Od2 = this.A00;
        if (c55143Od2 != null) {
            AKN akn = c55143Od2.A04;
            if (akn != null) {
                akn.A02();
            }
            C55143Od2 c55143Od22 = this.A00;
            if (c55143Od22 != null) {
                c55143Od22.A05(context, str);
                return;
            }
        }
        C14360o3.A0F("provider");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC65626Tpm
    public final void onCreate(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        this.A03 = true;
    }

    @Override // X.InterfaceC65626Tpm
    public final void onDestroy(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        C55143Od2 c55143Od2 = this.A00;
        if (c55143Od2 != null) {
            c55143Od2.A04();
        }
        O1B.A04 = null;
        O1B.A05 = null;
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onResume(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public final void A02(C09530e4 c09530e4) {
        C55143Od2 c55143Od2 = this.A00;
        if (c55143Od2 == null) {
            C14360o3.A0F("provider");
            throw C00O.createAndThrow();
        }
        C55611Omu c55611Omu = c55143Od2.A0D;
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c09530e4.A00);
        A0q.put("data", c09530e4.A01);
        c55611Omu.A02.A00(A0q);
    }
}
