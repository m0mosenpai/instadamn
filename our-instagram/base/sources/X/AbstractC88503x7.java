package X;

import com.instagram.clips.model.metadata.InteractionUpsellCTAType;
import java.io.IOException;

/* renamed from: X.3x7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88503x7 {
    public static C5HR parseFromJson(C16L c16l) {
        String A00;
        String A002;
        String A003;
        String A004;
        String A005;
        String A006;
        String A007;
        String A008;
        String A009;
        String A0010;
        String A0011;
        String A0012;
        String A0013;
        C0KX c0kx;
        String str;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            InteractionUpsellCTAType interactionUpsellCTAType = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(1268);
                A002 = AbstractC111324zv.A00(1027);
                A003 = AbstractC111324zv.A00(913);
                A004 = AbstractC111324zv.A00(897);
                A005 = AbstractC111324zv.A00(896);
                A006 = AbstractC111324zv.A00(895);
                A007 = AbstractC111324zv.A00(894);
                A008 = AbstractC111324zv.A00(893);
                A009 = AbstractC111324zv.A00(892);
                A0010 = AbstractC111324zv.A00(891);
                A0011 = AbstractC111324zv.A00(890);
                A0012 = AbstractC111324zv.A00(889);
                A0013 = AbstractC111324zv.A00(888);
                if (A1J == c16r) {
                    break;
                }
                String A0q = c16l.A0q();
                c16l.A1J();
                if (A0013.equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if (A0012.equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if (A0011.equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if (A0010.equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if (A009.equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if (A008.equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if (A007.equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if (A006.equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if (A005.equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if (A004.equals(A0q)) {
                    bool10 = Boolean.valueOf(c16l.A0d());
                } else if (A003.equals(A0q)) {
                    bool11 = Boolean.valueOf(c16l.A0d());
                } else if (A002.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    interactionUpsellCTAType = (InteractionUpsellCTAType) InteractionUpsellCTAType.A01.get(A1P);
                    if (interactionUpsellCTAType == null) {
                        interactionUpsellCTAType = InteractionUpsellCTAType.A0B;
                    }
                } else if (A00.equals(A0q)) {
                    bool12 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(A0013, "ClipsViewerInteractionSettings");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (bool3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(A0011, "ClipsViewerInteractionSettings");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(A0010, "ClipsViewerInteractionSettings");
                } else if (bool5 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(A009, "ClipsViewerInteractionSettings");
                } else if (bool6 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(A008, "ClipsViewerInteractionSettings");
                } else if (bool7 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(A007, "ClipsViewerInteractionSettings");
                } else if (bool8 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(A006, "ClipsViewerInteractionSettings");
                } else if (bool9 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(A005, "ClipsViewerInteractionSettings");
                } else if (bool10 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(A004, "ClipsViewerInteractionSettings");
                } else if (bool11 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(A003, "ClipsViewerInteractionSettings");
                } else {
                    if (interactionUpsellCTAType == null && (c16l instanceof C07950bF)) {
                        c0kx = ((C07950bF) c16l).A03;
                        str = A002;
                    } else if (bool12 == null && (c16l instanceof C07950bF)) {
                        c0kx = ((C07950bF) c16l).A03;
                        str = A00;
                    } else {
                        return new C5HR(interactionUpsellCTAType, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), bool7.booleanValue(), bool8.booleanValue(), bool9.booleanValue(), bool10.booleanValue(), bool11.booleanValue(), bool12.booleanValue());
                    }
                    c0kx.A00(str, "ClipsViewerInteractionSettings");
                }
            } else {
                ((C07950bF) c16l).A03.A00(A0012, "ClipsViewerInteractionSettings");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
