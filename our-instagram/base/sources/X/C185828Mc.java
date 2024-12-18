package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Mc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185828Mc implements InterfaceC185838Md, InterfaceC184058Eu {
    public TargetViewSizeProvider A00;
    public C8MT A01;
    public TransformMatrixConfig A02;
    public C47Z A03;
    public C195868lW A04;
    public List A05;
    public List A06;
    public C8DM A07 = C8DM.A0A;
    public final UserSession A08;

    @Override // X.InterfaceC185838Md
    public final void Duo() {
        C195868lW c195868lW;
        TransformMatrixConfig transformMatrixConfig = this.A02;
        if (transformMatrixConfig != null && (c195868lW = this.A04) != null) {
            C19K A02 = AnonymousClass194.A02(C12L.A00.AOT(497892810, 3));
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C9DD(this, c195868lW, transformMatrixConfig, null, 4), A02);
        }
    }

    @Override // X.InterfaceC185838Md
    public final void Dup(int i) {
    }

    @Override // X.InterfaceC185838Md
    public final void Duq() {
    }

    public final C8MT A00() {
        C8MT c8mt = this.A01;
        if (c8mt != null) {
            return c8mt;
        }
        C14360o3.A0F("freeTransformVideoController");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC184058Eu
    public final void DzQ(int i) {
        C47Z c47z;
        C195868lW c195868lW;
        List list;
        Float valueOf;
        C47Z c47z2;
        C8DM c8dm = this.A07;
        C8DM c8dm2 = C8DM.A09;
        if (c8dm == c8dm2 && A00().A08() == C8DM.A0A) {
            C8MT A00 = A00();
            TransformMatrixConfig transformMatrixConfig = A00.A05;
            if (transformMatrixConfig != null) {
                transformMatrixConfig.A02();
                C8MT.A03(A00);
            }
            C47Z c47z3 = this.A03;
            if (c47z3 != null) {
                C915647m c915647m = c47z3.A1i;
                c915647m.A03 = null;
                c915647m.A02 = null;
            }
        }
        if (this.A07 == c8dm2 && A00().A08() == C8DM.A0B && (c47z2 = this.A03) != null) {
            C915647m c915647m2 = c47z2.A1i;
            c915647m2.A03 = null;
            c915647m2.A02 = null;
        }
        C8DM c8dm3 = this.A07;
        C8DM c8dm4 = C8DM.A0A;
        if ((c8dm3 == c8dm4 || c8dm3 == C8DM.A0B) && A00().A08() == c8dm2 && (c47z = this.A03) != null) {
            List list2 = this.A06;
            List list3 = this.A05;
            C915647m c915647m3 = c47z.A1i;
            c915647m3.A03 = list2;
            c915647m3.A02 = list3;
        }
        if (A00().A08() == c8dm2 && (c195868lW = this.A04) != null) {
            TransformMatrixConfig transformMatrixConfig2 = A00().A05;
            if (transformMatrixConfig2 != null) {
                transformMatrixConfig2.A02();
            }
            TargetViewSizeProvider targetViewSizeProvider = this.A00;
            if (targetViewSizeProvider != null) {
                float width = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K.getWidth();
                if (this.A00 != null) {
                    float min = Math.min(5.0f, Math.max(0.3f, (c195868lW.A0K / c195868lW.A08) / (width / ((NineSixteenLayoutConfigImpl) r0).A0K.getHeight())));
                    TransformMatrixConfig transformMatrixConfig3 = A00().A05;
                    if (transformMatrixConfig3 != null) {
                        transformMatrixConfig3.A08.A01 = min;
                    }
                    UserSession userSession = this.A08;
                    String str = c195868lW.A0k;
                    int i2 = c195868lW.A0K;
                    int i3 = i * 1000;
                    C14360o3.A0B(str, 1);
                    AAL A002 = AbstractC185878Mh.A00(userSession).A00(str);
                    if (A002 != null && (list = A002.A06) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (((Number) obj).intValue() <= i3) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            int intValue = ((Number) AbstractC001800i.A0K(arrayList)).intValue();
                            Iterator it = list.iterator();
                            int i4 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    if (((Number) it.next()).intValue() == intValue) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                } else {
                                    i4 = -1;
                                    break;
                                }
                            }
                            Integer valueOf2 = Integer.valueOf(i4);
                            if (valueOf2 != null) {
                                int intValue2 = valueOf2.intValue();
                                List list4 = A002.A04;
                                if (list4 != null) {
                                    if (list4.size() > intValue2) {
                                        A7X a7x = (A7X) list4.get(intValue2);
                                        if (a7x != null && (valueOf = Float.valueOf((i2 * a7x.A00) / A002.A01)) != null) {
                                            C8MT A003 = A00();
                                            float floatValue = valueOf.floatValue();
                                            float f = c195868lW.A0K;
                                            float f2 = 0.5f - (((c195868lW.A08 * 0.5625f) / 2.0f) / f);
                                            float max = Math.max(Math.min(((f / 2.0f) - floatValue) / f, f2), -f2);
                                            TransformMatrixConfig transformMatrixConfig4 = A003.A05;
                                            if (transformMatrixConfig4 != null) {
                                                TransformMatrixParams transformMatrixParams = transformMatrixConfig4.A08;
                                                transformMatrixParams.A02 = transformMatrixParams.A01 * transformMatrixConfig4.A00 * max;
                                                C8MT.A03(A003);
                                            }
                                        }
                                    } else {
                                        C0K8.A0C("SmartTrackingDataModelHelper", AnonymousClass001.A02(intValue2, list4.size(), "Index out of bound. Index: ", " Size: "));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("targetViewSizeProvider");
            throw C00O.createAndThrow();
        }
        C8DM A08 = A00().A08();
        if (A08 == null) {
            A08 = c8dm4;
        }
        this.A07 = A08;
    }

    public C185828Mc(UserSession userSession) {
        this.A08 = userSession;
    }
}
