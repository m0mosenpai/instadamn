package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import com.instagram.model.reels.Reel;
import com.instagram.react.modules.base.IgReactQEModule;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.List;

/* renamed from: X.GsW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38287GsW implements C3CQ {
    public final int A00;
    public final Object A01;

    public C38287GsW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C3CO A00(UserSession userSession, Object obj, int i) {
        return new C3CO(userSession, new C38287GsW(obj, i), false, false);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C3CQ
    public final boolean AJk(C38321qM c38321qM) {
        C155946zO c155946zO;
        C3XG c3xg;
        C42748Ivm c42748Ivm;
        String id;
        InterfaceC09390do interfaceC09390do;
        List list;
        String str;
        Reel reel;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c38321qM, 0);
                HEN hen = ((HDF) this.A01).A00;
                if (hen != null) {
                    c155946zO = hen.A02;
                    return c155946zO.A0C(c38321qM);
                }
                C14360o3.A0F("adapter");
                throw C00O.createAndThrow();
            case 1:
                C14360o3.A0B(c38321qM, 0);
                HEO heo = ((HD7) this.A01).A01;
                if (heo != null) {
                    c155946zO = heo.A04;
                    return c155946zO.A0C(c38321qM);
                }
                C14360o3.A0F("adapter");
                throw C00O.createAndThrow();
            case 2:
                C14360o3.A0B(c38321qM, 0);
                HEH heh = ((GenericSurveyFragment) this.A01).A05;
                if (heh != null) {
                    for (Object obj : heh.A04) {
                        IKO iko = (IKO) obj;
                        if (iko.A08 == C05F.A00 && (c3xg = iko.A02) != null && C3XH.A02(c3xg.A05) == c38321qM) {
                            if (obj != null) {
                                return true;
                            }
                            return false;
                        }
                    }
                    return false;
                }
                C14360o3.A0F("adapter");
                throw C00O.createAndThrow();
            case 3:
                c155946zO = ((HDJ) this.A01).A04.A07;
                return c155946zO.A0C(c38321qM);
            case 4:
                C14360o3.A0B(c38321qM, 0);
                ((C38288GsX) this.A01).A0A();
                return false;
            case 5:
                C14360o3.A0B(c38321qM, 0);
                c155946zO = ((HEX) ((HCU) this.A01).A06.getValue()).A00;
                return c155946zO.A0C(c38321qM);
            case 6:
                C14360o3.A0B(c38321qM, 0);
                c155946zO = ((C38978HEg) ((HCX) this.A01).A07.getValue()).A02;
                return c155946zO.A0C(c38321qM);
            case 7:
                C14360o3.A0B(c38321qM, 0);
                c42748Ivm = (C42748Ivm) ((HEY) ((HCV) this.A01).A06.getValue()).A00.getValue();
                id = c38321qM.getId();
                if (id == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return c42748Ivm.A04(id);
            case 8:
                C14360o3.A0B(c38321qM, 0);
                c42748Ivm = (C42748Ivm) ((C38979HEh) ((HCW) this.A01).A07.getValue()).A06.getValue();
                id = c38321qM.getId();
                if (id == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return c42748Ivm.A04(id);
            case 9:
                C14360o3.A0B(c38321qM, 0);
                interfaceC09390do = ((HCS) this.A01).A07;
                c155946zO = ((C38975HEd) interfaceC09390do.getValue()).A02;
                return c155946zO.A0C(c38321qM);
            case 10:
                C14360o3.A0B(c38321qM, 0);
                interfaceC09390do = ((HCT) this.A01).A07;
                c155946zO = ((C38975HEd) interfaceC09390do.getValue()).A02;
                return c155946zO.A0C(c38321qM);
            case 11:
                return true;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(c38321qM, 0);
                C38977HEf c38977HEf = ((HDG) this.A01).A01;
                if (c38977HEf != null) {
                    c155946zO = c38977HEf.A04;
                    return c155946zO.A0C(c38321qM);
                }
                C14360o3.A0F("adapter");
                throw C00O.createAndThrow();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(c38321qM, 0);
                C51758Mth c51758Mth = (C51758Mth) ((C38316GtB) ((HCQ) this.A01).A0S.getValue()).A00.A02();
                if (c51758Mth != null && (list = (List) c51758Mth.A00) != null) {
                    for (Object obj2 : list) {
                        String id2 = c38321qM.getId();
                        C38321qM A02 = C3XH.A02(((C3XG) obj2).A05);
                        if (A02 != null) {
                            str = A02.getId();
                        } else {
                            str = null;
                        }
                        if (C14360o3.A0K(id2, str)) {
                            if (obj2 != null) {
                                return true;
                            }
                            return false;
                        }
                    }
                    return false;
                }
                return false;
            case 14:
                C14360o3.A0B(c38321qM, 0);
                HY4 hy4 = ((HDI) this.A01).A04;
                if (hy4 != null) {
                    if (hy4.A0E(c38321qM)) {
                        return true;
                    }
                    return false;
                }
                C14360o3.A0F("adapter");
                throw C00O.createAndThrow();
            default:
                if (c38321qM.A00 != 0 && (reel = ((ReelDashboardFragment) this.A01).A07) != null && reel.A1B(c38321qM)) {
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C3CQ
    public final void DSP(C38321qM c38321qM) {
        InterfaceC09390do interfaceC09390do;
        String str;
        C66362zD c66362zD;
        switch (this.A00) {
            case 0:
                HEN hen = ((HDF) this.A01).A00;
                if (hen != null) {
                    hen.A0C();
                    return;
                }
                str = "adapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
                HEO heo = ((HD7) this.A01).A01;
                if (heo != null) {
                    heo.A0C();
                    return;
                }
                str = "adapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                HEH heh = ((GenericSurveyFragment) this.A01).A05;
                if (heh != null) {
                    HEH.A00(heh);
                    return;
                }
                str = "adapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                C0fA.A00(((HDJ) this.A01).A04, 655233526);
                return;
            case 4:
                C66095TzW c66095TzW = ((C38288GsX) this.A01).A04;
                if (c66095TzW != null) {
                    c66095TzW.update();
                    return;
                }
                str = "adapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                HEX.A00((HCU) this.A01);
                return;
            case 6:
                C14360o3.A0B(c38321qM, 0);
                ((C38978HEg) ((HCX) this.A01).A07.getValue()).A00();
                return;
            case 7:
                HEY.A00((HCV) this.A01);
                return;
            case 8:
                C14360o3.A0B(c38321qM, 0);
                ((C38979HEh) ((HCW) this.A01).A07.getValue()).A00();
                return;
            case 9:
                interfaceC09390do = ((HCS) this.A01).A07;
                C38975HEd.A00(interfaceC09390do);
                return;
            case 10:
                interfaceC09390do = ((HCT) this.A01).A07;
                C38975HEd.A00(interfaceC09390do);
                return;
            case 11:
                C153766vl c153766vl = ((HCZ) this.A01).A04;
                if (c153766vl == null) {
                    str = "clipsGridAdapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c66362zD = c153766vl.A0I;
                c66362zD.notifyDataSetChanged();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C38977HEf c38977HEf = ((HDG) this.A01).A01;
                if (c38977HEf != null) {
                    C38977HEf.A00(c38977HEf);
                    return;
                }
                str = "adapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c66362zD = HCQ.A00((HCQ) this.A01);
                c66362zD.notifyDataSetChanged();
                return;
            case 14:
                HY4 hy4 = ((HDI) this.A01).A04;
                if (hy4 != null) {
                    hy4.AVK();
                    return;
                }
                str = "adapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                ((ReelDashboardFragment) this.A01).A0O(true);
                return;
        }
    }
}
