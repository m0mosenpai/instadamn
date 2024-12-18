package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EU0 extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public EU0(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj2;
        this.A05 = z;
        this.A03 = obj;
        this.A04 = obj4;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(-1218701515);
                i = -968398434;
                break;
            case 2:
                A03 = C0f9.A03(826347082);
                Reel reel = (Reel) this.A03;
                UserSession userSession = (UserSession) this.A04;
                boolean z = this.A05;
                C35108FeA.A00(userSession, reel, !z);
                Context context = (Context) this.A01;
                int i3 = 2131976176;
                if (z) {
                    i3 = 2131968098;
                }
                String string = context.getString(i3);
                if (z) {
                    i2 = 233;
                } else {
                    i2 = 594;
                }
                C9GR.A03(context, string, MSV.A00(i2), 0);
                i = 1946316798;
                break;
            case 3:
                A03 = C0f9.A03(-919260783);
                ((C1P1) this.A01).onFail(abstractC115105If);
                Object A00 = abstractC115105If.A00();
                if (A00 != null) {
                    C9GR.A09((Context) this.A02, ((EDR) A00).A02);
                }
                i = 2113683663;
                break;
            default:
                super.onFail(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(1579443616);
                int A032 = C0f9.A03(-201283497);
                AbstractC44152JfH.A00((UserSession) this.A04).A00((C45026JwH) this.A02);
                LJL.A01((Context) this.A01, (InterfaceC16820sZ) this.A03, this.A05);
                C0f9.A0A(960310320, A032);
                i = 1501363375;
                break;
            case 2:
                A03 = C0f9.A03(-1184525164);
                int A033 = C0f9.A03(332253478);
                C34452FGq c34452FGq = (C34452FGq) this.A02;
                boolean z = this.A05;
                c34452FGq.A00.A0D(true);
                Context context = (Context) this.A01;
                int i2 = 2131968096;
                if (z) {
                    i2 = 2131968095;
                }
                C9GR.A09(context, context.getString(i2));
                C0f9.A0A(253279404, A033);
                i = -1185066299;
                break;
            case 3:
                A03 = C0f9.A03(-1888745662);
                int A034 = C0f9.A03(-182654126);
                AbstractC31171DnF.A1R(this.A01, obj);
                C0f9.A0A(-103867579, A034);
                i = 256475226;
                break;
            case 4:
                A03 = C0f9.A03(-1739881332);
                InterfaceC124295jj interfaceC124295jj = (InterfaceC124295jj) obj;
                int A035 = C0f9.A03(-170862802);
                C14360o3.A0B(interfaceC124295jj, 0);
                super.onSuccess(interfaceC124295jj);
                Iterator it = interfaceC124295jj.AoP().iterator();
                while (it.hasNext()) {
                    C38321qM c38321qM = ((C120985dq) it.next()).A02;
                    if (c38321qM != null) {
                        AbstractMap abstractMap = (AbstractMap) this.A02;
                        C41112IId c41112IId = (C41112IId) this.A03;
                        String id = c38321qM.getId();
                        if (id != null) {
                            Object obj2 = AbstractC167007dF.A0m(id, "_", 0).get(0);
                            C43057J1x c43057J1x = (C43057J1x) abstractMap.get(obj2);
                            if (c43057J1x != null) {
                                C14360o3.A0B(obj2, 0);
                                c41112IId.A01.put(obj2, new IG1(c38321qM, c43057J1x, c41112IId.A00));
                            }
                        } else {
                            IllegalStateException A0g = AbstractC166997dE.A0g();
                            C0f9.A0A(-130579159, A035);
                            throw A0g;
                        }
                    }
                }
                if (this.A05) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.A02;
                    C41761Iec.A04((InterfaceC11380iw) this.A01, (UserSession) this.A04, linkedHashMap);
                }
                C0f9.A0A(-1429908830, A035);
                i = 277831709;
                break;
            default:
                super.onSuccess(obj);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        int i2;
        AbstractC907342m A00;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1648281102);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                int A0N = AbstractC167017dG.A0N(anonymousClass435, 675526429);
                AbstractC907342m abstractC907342m = (AbstractC907342m) anonymousClass435.A01;
                String str = null;
                if (abstractC907342m != null && abstractC907342m.A00(E5F.class, "ig_iab_autofill_save_data_entries") != null && (A00 = abstractC907342m.A00(E5F.class, "ig_iab_autofill_save_data_entries")) != null && A00.A05("ent_id") != null) {
                    AbstractC907342m A002 = abstractC907342m.A00(E5F.class, "ig_iab_autofill_save_data_entries");
                    if (A002 != null) {
                        str = A002.A05("ent_id");
                    }
                    AutofillData autofillData = (AutofillData) this.A01;
                    Map map = autofillData.A00;
                    if (str == null) {
                        map.remove(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    } else {
                        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
                    }
                    if (this.A05) {
                        C20J.A03(autofillData);
                    }
                    SCG scg = (SCG) this.A02;
                    if (scg != null) {
                        STG.A00(new TLW(scg.A00));
                    }
                    i = -1767522424;
                } else {
                    C0w9.A03(AbstractC58317Pt9.A00(160), "Error creating add-contact autofill response");
                    SCG scg2 = (SCG) this.A02;
                    if (scg2 != null) {
                        STG.A00(new RunnableC64666TOx(scg2.A00, "Error creating add-contact autofill response"));
                    }
                    i = -728211864;
                }
                C0f9.A0A(i, A0N);
                i2 = -912838550;
                break;
            case 1:
            case 2:
            default:
                super.onSuccessInBackground(obj);
                return;
            case 3:
                A03 = C0f9.A03(-510345780);
                int A032 = C0f9.A03(1902080534);
                User user = (User) this.A04;
                user.A13(this.A05);
                ((C25671My) this.A03).E4s(new C70063Cq(user, false, false, true, false));
                C0f9.A0A(67559718, A032);
                i2 = 1222424936;
                break;
        }
        C0f9.A0A(i2, A03);
    }
}
