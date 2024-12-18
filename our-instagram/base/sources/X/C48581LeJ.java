package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.LeJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48581LeJ implements InterfaceC58110PpZ {
    public final /* synthetic */ C45758KNl A00;

    @Override // X.InterfaceC58110PpZ
    public final void DtC(C47283Kuu c47283Kuu) {
        C14360o3.A0B(c47283Kuu, 0);
        try {
            UserSession A0A = this.A00.A0A();
            FHB fhb = (FHB) A0A.A01(FHB.class, new GSw(A0A, 12));
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            C16V.A03(A0S, "filters");
            for (C54629OBe c54629OBe : c47283Kuu.A00) {
                if (c54629OBe != null) {
                    A0S.A0d();
                    A0S.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c54629OBe.A00);
                    A0S.A0T("hidden", c54629OBe.A02);
                    A0S.A0T("new", c54629OBe.A03);
                    A0S.A0a();
                }
            }
            A0S.A0Z();
            String A0l = AbstractC167017dG.A0l(A0S, stringWriter);
            InterfaceC19610xo ARD = fhb.A00.ARD();
            ARD.E7K("photo_filter_tray", A0l);
            ARD.apply();
        } catch (IOException unused) {
        }
    }

    @Override // X.InterfaceC58110PpZ
    public final void DtD(C44428Jkf c44428Jkf) {
        C14360o3.A0B(c44428Jkf, 0);
        C44437Jky c44437Jky = c44428Jkf.A05;
        InterfaceC50490MQs interfaceC50490MQs = c44437Jky.A01;
        C14360o3.A07(interfaceC50490MQs);
        C56227Oxa c56227Oxa = (C56227Oxa) interfaceC50490MQs.Arg();
        boolean z = true;
        if (c56227Oxa != null) {
            int A00 = C44437Jky.A00(c44437Jky);
            C45758KNl c45758KNl = this.A00;
            if (A00 == c45758KNl.A00) {
                c56227Oxa.A03 = c45758KNl.A07;
                C47Z A0B = c45758KNl.A0B(c45758KNl.A0A());
                if (A0B != null) {
                    int i = A0B.A1i.A00;
                    FilterGroupModel filterGroupModel = ((KB4) c45758KNl).A06;
                    if (filterGroupModel != null && ((FilterGroupModelImpl) filterGroupModel).A04) {
                        c56227Oxa.A00 = i;
                    } else {
                        AbstractC166997dE.A1U(Integer.valueOf(C44437Jky.A00(c44437Jky)), c56227Oxa.A03, i);
                    }
                    C9KJ c9kj = c45758KNl.A06;
                    if (c9kj != null) {
                        c56227Oxa.A01(c44428Jkf, c9kj, null, null);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        }
        if (C44437Jky.A00(c44437Jky) != this.A00.A00) {
            z = false;
        }
        c44428Jkf.setChecked(z);
    }

    @Override // X.InterfaceC58110PpZ
    public final void DtE(C44428Jkf c44428Jkf, boolean z) {
        Object value;
        Integer num;
        C14360o3.A0B(c44428Jkf, 0);
        C45758KNl c45758KNl = this.A00;
        C44437Jky c44437Jky = c44428Jkf.A05;
        c45758KNl.A00 = C44437Jky.A00(c44437Jky);
        InterfaceC50490MQs interfaceC50490MQs = c44437Jky.A01;
        C14360o3.A07(interfaceC50490MQs);
        InterfaceC58189Pqv Arg = interfaceC50490MQs.Arg();
        if (Arg != null) {
            C56227Oxa c56227Oxa = (C56227Oxa) Arg;
            c56227Oxa.A03 = c45758KNl.A07;
            C47Z A0B = c45758KNl.A0B(c45758KNl.A0A());
            if (A0B != null) {
                if (c45758KNl.A06 != null) {
                    C915647m c915647m = A0B.A1i;
                    int i = c45758KNl.A00;
                    c915647m.A01 = i;
                    C45758KNl.A00(c45758KNl, A0B, i);
                    C9KJ c9kj = c45758KNl.A06;
                    if (c9kj != null) {
                        c9kj.CoQ();
                    }
                    FilterGroupModel filterGroupModel = ((KB4) c45758KNl).A06;
                    C9KJ c9kj2 = c45758KNl.A06;
                    if (c9kj2 != null) {
                        if (c56227Oxa.A01(c44428Jkf, c9kj2, null, filterGroupModel)) {
                            if (z) {
                                if (c45758KNl.A0A) {
                                    C18U.A06(C06090Tz.A05, c45758KNl.A0A(), 36318724491647412L);
                                }
                                C05A c05a = ((C44516JmM) c45758KNl.A0D.getValue()).A00;
                                do {
                                    value = c05a.getValue();
                                    num = (Integer) ((C51733MtG) value).A01;
                                    C14360o3.A0B(num, 0);
                                } while (!c05a.AIi(value, new C51733MtG(num, false, false, false, false, false)));
                                c45758KNl.A04 = Arg;
                                ViewSwitcher viewSwitcher = c45758KNl.A03;
                                if (viewSwitcher != null) {
                                    viewSwitcher.setDisplayedChild(1);
                                }
                                View Aa0 = Arg.Aa0(c45758KNl.getThemedContext());
                                if (Aa0 != null) {
                                    ViewGroup viewGroup = c45758KNl.A02;
                                    if (viewGroup != null) {
                                        viewGroup.addView(Aa0);
                                    }
                                    C50695MZq.A00(c45758KNl.A0A(), new C52503NKw(Arg.getTitle()));
                                    AnonymousClass229.A01(c45758KNl.A0A()).A1A(AnonymousClass249.VIDEO);
                                    return;
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            return;
                        }
                        if (!z) {
                            return;
                        }
                        L64 A00 = AbstractC53887NsJ.A00(c45758KNl.A0A());
                        InterfaceC50490MQs interfaceC50490MQs2 = c44437Jky.A01;
                        C14360o3.A07(interfaceC50490MQs2);
                        A00.A00(interfaceC50490MQs2.getName(), false);
                        C22C A01 = AnonymousClass229.A01(c45758KNl.A0A());
                        int i2 = c45758KNl.A00;
                        List list = c45758KNl.A08;
                        if (list == null) {
                            C14360o3.A0F("filterList");
                            throw C00O.createAndThrow();
                        }
                        int A002 = AbstractC53889NsL.A00(list, i2);
                        if (A01.A0J() == null) {
                            return;
                        }
                        A01.A1B(AnonymousClass249.VIDEO, EnumC50631MWs.A0I, i2, A002);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public C48581LeJ(C45758KNl c45758KNl) {
        this.A00 = c45758KNl;
    }
}
