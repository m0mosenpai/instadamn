package X;

import androidx.fragment.app.Fragment;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.prompt.model.PromptStickerModel;
import org.json.JSONObject;

/* renamed from: X.LWp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48240LWp implements C53O {
    public final int A00;
    public final Object A01;

    public C48240LWp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C53O
    public final /* synthetic */ void CyY() {
        C60842q8 A0a;
        C57312k6 A00;
        InterfaceC16620sF c57169PZn;
        InterfaceC09390do interfaceC09390do;
        C57312k6 A002;
        InterfaceC16620sF pzp;
        AbstractC45465KBa abstractC45465KBa;
        Object value;
        C48597LeZ c48597LeZ;
        C38321qM c38321qM;
        switch (this.A00) {
            case 1:
                C45440KAb c45440KAb = (C45440KAb) this.A01;
                interfaceC09390do = c45440KAb.A02;
                abstractC45465KBa = c45440KAb;
                if (((C143266dR) interfaceC09390do.getValue()).A02()) {
                    C07S c07s = C07S.STARTED;
                    C07X viewLifecycleOwner = c45440KAb.getViewLifecycleOwner();
                    A002 = C07Y.A00(viewLifecycleOwner);
                    pzp = new MC8(c07s, c45440KAb, viewLifecycleOwner, null, 21);
                    AbstractC166987dD.A1Z(pzp, A002);
                    value = interfaceC09390do.getValue();
                    ((C143266dR) value).A00();
                    return;
                }
                abstractC45465KBa.A0E();
                return;
            case 2:
                C25814BbV c25814BbV = (C25814BbV) this.A01;
                C05A c05a = c25814BbV.A0O;
                InterfaceC38371qR interfaceC38371qR = c25814BbV.A0B.A00;
                if (interfaceC38371qR != null) {
                    c38321qM = interfaceC38371qR.BQN();
                } else {
                    c38321qM = null;
                }
                c05a.Egh(new C7e6(c38321qM, true, true));
                return;
            case 3:
                c48597LeZ = (C48597LeZ) this.A01;
                c48597LeZ.A05.CyY();
                return;
            case 4:
                c48597LeZ = (C48597LeZ) this.A01;
                Fragment fragment = c48597LeZ.A02;
                if (fragment.mDetached) {
                    return;
                }
                MHQ mhq = new MHQ(c48597LeZ, 5);
                InterfaceC09390do A003 = AbstractC09440dt.A00(EnumC09460dv.A02, new MHQ(new MHQ(fragment, 2), 3));
                A0a = AbstractC25225BEi.A0a(new MHQ(A003, 4), mhq, new B61(9, null, A003), AbstractC25225BEi.A1D(C143266dR.class));
                if (((C143266dR) A0a.getValue()).A02()) {
                    Object value2 = A0a.getValue();
                    C07S c07s2 = C07S.STARTED;
                    C07X viewLifecycleOwner2 = fragment.getViewLifecycleOwner();
                    A00 = C07Y.A00(viewLifecycleOwner2);
                    c57169PZn = new MCP(viewLifecycleOwner2, c07s2, c48597LeZ, value2, null, 41);
                    AbstractC166987dD.A1Z(c57169PZn, A00);
                    value = A0a.getValue();
                    ((C143266dR) value).A00();
                    return;
                }
                c48597LeZ.A05.CyY();
                return;
            case 5:
            case 7:
            case 10:
            default:
                return;
            case 6:
                AbstractC45465KBa abstractC45465KBa2 = (AbstractC45465KBa) this.A01;
                C50251MHg c50251MHg = new C50251MHg(abstractC45465KBa2, 24);
                InterfaceC09390do A01 = C50251MHg.A01(new C50251MHg(abstractC45465KBa2, 21), EnumC09460dv.A02, 22);
                A0a = AbstractC25225BEi.A0a(new C50251MHg(A01, 23), c50251MHg, new C50169MDw(32, A01, null), AbstractC25225BEi.A1D(C143266dR.class));
                abstractC45465KBa = abstractC45465KBa2;
                if (((C143266dR) A0a.getValue()).A02()) {
                    Object value3 = A0a.getValue();
                    C07S c07s3 = C07S.STARTED;
                    C07X viewLifecycleOwner3 = abstractC45465KBa2.getViewLifecycleOwner();
                    A00 = C07Y.A00(viewLifecycleOwner3);
                    c57169PZn = new MCM(viewLifecycleOwner3, c07s3, value3, abstractC45465KBa2, null, 16);
                    AbstractC166987dD.A1Z(c57169PZn, A00);
                    value = A0a.getValue();
                    ((C143266dR) value).A00();
                    return;
                }
                abstractC45465KBa.A0E();
                return;
            case 8:
                C45441KAc c45441KAc = (C45441KAc) this.A01;
                interfaceC09390do = c45441KAc.A06;
                if (((C143266dR) interfaceC09390do.getValue()).A02()) {
                    C07S c07s4 = C07S.STARTED;
                    C07X viewLifecycleOwner4 = c45441KAc.getViewLifecycleOwner();
                    A002 = C07Y.A00(viewLifecycleOwner4);
                    pzp = new PZP(viewLifecycleOwner4, c07s4, c45441KAc, null, 34);
                    AbstractC166987dD.A1Z(pzp, A002);
                    value = interfaceC09390do.getValue();
                    ((C143266dR) value).A00();
                    return;
                }
                c45441KAc.A0E();
                C50904MeZ c50904MeZ = (C50904MeZ) c45441KAc.A05.getValue();
                C46019KYk c46019KYk = C46019KYk.A00;
                C14360o3.A0B(c46019KYk, 0);
                c50904MeZ.A02.Egh(c46019KYk);
                return;
            case 9:
                KA3 ka3 = (KA3) this.A01;
                C25027B5z c25027B5z = new C25027B5z(ka3, 29);
                InterfaceC09390do A004 = AbstractC09440dt.A00(EnumC09460dv.A02, new C25027B5z(new C25027B5z(ka3, 26), 27));
                A0a = AbstractC25225BEi.A0a(new C25027B5z(A004, 28), c25027B5z, new C57257Pbf(33, null, A004), AbstractC25225BEi.A1D(C143266dR.class));
                C60842q8 A0a2 = AbstractC25225BEi.A0a(new C25027B5z(ka3, 25), new C25027B5z(ka3, 30), new C57257Pbf(32, null, ka3), AbstractC25225BEi.A1D(StoriesTemplateParticipationViewModel.class));
                PromptStickerModel promptStickerModel = ((StoriesTemplateParticipationViewModel) A0a2.getValue()).A02;
                C8FC c8fc = ((StoriesTemplateParticipationViewModel) A0a2.getValue()).A03;
                if (ka3.A08 && promptStickerModel != null && c8fc != null) {
                    C189478aR c189478aR = ka3.A02;
                    if (c189478aR != null) {
                        c189478aR.A07();
                    }
                    ((StoriesTemplateParticipationViewModel) A0a2.getValue()).A01(((StoriesTemplateParticipationViewModel) A0a2.getValue()).A00, promptStickerModel, c8fc, true);
                    return;
                }
                if (((C143266dR) A0a.getValue()).A02()) {
                    Object value4 = A0a.getValue();
                    C07S c07s5 = C07S.STARTED;
                    C07X viewLifecycleOwner5 = ka3.getViewLifecycleOwner();
                    A00 = C07Y.A00(viewLifecycleOwner5);
                    c57169PZn = new C57169PZn(viewLifecycleOwner5, c07s5, value4, ka3, null, 22);
                    AbstractC166987dD.A1Z(c57169PZn, A00);
                    value = A0a.getValue();
                    ((C143266dR) value).A00();
                    return;
                }
                KA3.A00(ka3);
                return;
            case 11:
                C56807PIz.A00((C56807PIz) this.A01);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                abstractC45465KBa = (AbstractC45465KBa) this.A01;
                abstractC45465KBa.A0E();
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.fragment.app.Fragment] */
    @Override // X.C53O
    public final void Cya() {
        Object obj;
        C05A c05a;
        AbstractC45465KBa abstractC45465KBa;
        switch (this.A00) {
            case 0:
                abstractC45465KBa = (Fragment) this.A01;
                AbstractC25226BEj.A1Q(abstractC45465KBa);
                return;
            case 1:
                C45440KAb c45440KAb = (C45440KAb) this.A01;
                c45440KAb.A0F();
                ((C167377dr) c45440KAb.A03.getValue()).A03.Egh(KEA.A00);
                abstractC45465KBa = c45440KAb;
                AbstractC25226BEj.A1Q(abstractC45465KBa);
                return;
            case 2:
            case 3:
            case 4:
            case 9:
            case 10:
            case 11:
            default:
                return;
            case 5:
                C45445KAg c45445KAg = (C45445KAg) this.A01;
                c45445KAg.A0F();
                C44500Jm6 A0S = AbstractC43593JPy.A0S(c45445KAg);
                obj = KN1.A00;
                C14360o3.A0B(obj, 0);
                c05a = A0S.A03;
                c05a.Egh(obj);
                return;
            case 6:
                AbstractC45465KBa abstractC45465KBa2 = (AbstractC45465KBa) this.A01;
                abstractC45465KBa2.A0F();
                abstractC45465KBa = abstractC45465KBa2;
                AbstractC25226BEj.A1Q(abstractC45465KBa);
                return;
            case 7:
                KD6 kd6 = (KD6) this.A01;
                ((C44514JmK) kd6.A0d.getValue()).A00();
                LAG lag = kd6.A0E;
                if (lag == null) {
                    return;
                }
                lag.A02(C16930sl.A00);
                return;
            case 8:
                C45441KAc c45441KAc = (C45441KAc) this.A01;
                c45441KAc.A0F();
                AbstractC31177DnL.A12(c45441KAc);
                C50904MeZ c50904MeZ = (C50904MeZ) c45441KAc.A05.getValue();
                obj = C46020KYl.A00;
                C14360o3.A0B(obj, 0);
                c05a = c50904MeZ.A02;
                c05a.Egh(obj);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C45442KAd c45442KAd = (C45442KAd) this.A01;
                c45442KAd.A0F();
                c45442KAd.A06 = true;
                AbstractC31179DnN.A0x(c45442KAd);
                return;
        }
    }

    @Override // X.C53O
    public final void Cyb() {
        C189478aR c189478aR;
        switch (this.A00) {
            case 0:
                KBS kbs = (KBS) this.A01;
                C55555Olp c55555Olp = kbs.A01;
                if (c55555Olp != null) {
                    kbs.A06.getValue();
                    JSONObject A0q = AbstractC31171DnF.A0q();
                    A0q.put("avatar", true);
                    A0q.put("camera", true);
                    c55555Olp.A02(AbstractC166987dD.A1L("reset_event", A0q));
                }
                C44418JkD c44418JkD = kbs.A02;
                if (c44418JkD == null) {
                    return;
                }
                c44418JkD.A00();
                return;
            case 9:
                KA3 ka3 = (KA3) this.A01;
                AbstractC439921h abstractC439921h = C20Y.A00(AbstractC166987dD.A0r(ka3.A0P)).A01.A00;
                if ((C14360o3.A0K(abstractC439921h, C125535lz.A00) && !C14360o3.A0K(abstractC439921h, ka3.A01)) || (c189478aR = ka3.A02) == null) {
                    return;
                }
                c189478aR.A07();
                return;
            case 10:
                ((NTC) this.A01).A03.A03(new PBX(true));
                return;
            default:
                return;
        }
    }

    @Override // X.C53O
    public final void Cym() {
        Object obj;
        C05A c05a;
        switch (this.A00) {
            case 0:
                KBS kbs = (KBS) this.A01;
                C55555Olp c55555Olp = kbs.A01;
                if (c55555Olp != null) {
                    kbs.A06.getValue();
                    JSONObject A0q = AbstractC31171DnF.A0q();
                    A0q.put("event_name", "reload_avatar");
                    c55555Olp.A02(AbstractC166987dD.A1L("avatar_fetch_event", A0q));
                }
                C44418JkD c44418JkD = kbs.A02;
                if (c44418JkD == null) {
                    return;
                }
                c44418JkD.A00();
                return;
            case 1:
                C45440KAb c45440KAb = (C45440KAb) this.A01;
                c45440KAb.A0G();
                ((C167377dr) c45440KAb.A03.getValue()).A03.Egh(KEA.A00);
                return;
            case 2:
            case 3:
            case 4:
            case 9:
            case 10:
            case 11:
            default:
                return;
            case 5:
                C45445KAg c45445KAg = (C45445KAg) this.A01;
                c45445KAg.A0G();
                C44500Jm6 A0S = AbstractC43593JPy.A0S(c45445KAg);
                obj = KN2.A00;
                C14360o3.A0B(obj, 0);
                c05a = A0S.A03;
                break;
            case 6:
                ((AbstractC45465KBa) this.A01).A0G();
                return;
            case 7:
                KD6 kd6 = (KD6) this.A01;
                ((C44514JmK) kd6.A0d.getValue()).A00();
                LAG lag = kd6.A0E;
                if (lag != null) {
                    lag.A02(C16930sl.A00);
                }
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = kd6.getViewLifecycleOwner();
                AbstractC166987dD.A1Z(new MCI(viewLifecycleOwner, c07s, kd6, null, 8), C07Y.A00(viewLifecycleOwner));
                return;
            case 8:
                C45441KAc c45441KAc = (C45441KAc) this.A01;
                c45441KAc.A0G();
                C50904MeZ c50904MeZ = (C50904MeZ) c45441KAc.A05.getValue();
                obj = C46021KYm.A00;
                C14360o3.A0B(obj, 0);
                c05a = c50904MeZ.A02;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C45442KAd c45442KAd = (C45442KAd) this.A01;
                c45442KAd.A0G();
                InterfaceC16820sZ interfaceC16820sZ = c45442KAd.A05;
                if (interfaceC16820sZ == null) {
                    return;
                }
                interfaceC16820sZ.invoke();
                return;
        }
        c05a.Egh(obj);
    }
}
