package X;

import com.facebook.cameracore.ardelivery.model.ARRequestAsset;

/* renamed from: X.9Wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211499Wy extends AbstractC178807ws implements BEQ {
    public C224099ut A00;
    public BBO A01;
    public final InterfaceC142616cN A02;

    public final void A0A(C203678zW c203678zW) {
        C177797vD c177797vD;
        if (this.A01 == null) {
            this.A01 = (BBO) ((BEP) InterfaceC178207vu.A00(this, BEP.A00));
        }
        InterfaceC179497xz interfaceC179497xz = (InterfaceC179497xz) InterfaceC178207vu.A00(this, InterfaceC179497xz.A01);
        if (c203678zW != null) {
            BBO bbo = this.A01;
            C14360o3.A0A(bbo);
            c177797vD = bbo.AJy(c203678zW);
        } else {
            c177797vD = new C177797vD(null, null);
        }
        interfaceC179497xz.DfO(c177797vD);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, X.9ut] */
    @Override // X.BEQ
    public final void ETc(ARRequestAsset aRRequestAsset, C203758zj c203758zj, BCR bcr, C1819185b c1819185b, String str) {
        if (str != null && aRRequestAsset != null) {
            C224099ut c224099ut = this.A00;
            C224099ut c224099ut2 = c224099ut;
            if (c224099ut == null) {
                C150486px B4B = ((BEP) InterfaceC178207vu.A00(this, BEP.A00)).B4B();
                C14360o3.A07(B4B);
                InterfaceC142616cN interfaceC142616cN = this.A02;
                ?? obj = new Object();
                obj.A00 = B4B;
                obj.A01 = interfaceC142616cN;
                this.A00 = obj;
                c224099ut2 = obj;
            }
            C14360o3.A0A(c224099ut2);
            if (c224099ut2 != null) {
                AV5 av5 = new AV5(c203758zj, bcr, this, str);
                C23055AEm c23055AEm = C23055AEm.A00;
                C150486px c150486px = c224099ut2.A00;
                C23310AUv c23310AUv = new C23310AUv(av5, aRRequestAsset, c224099ut2, c23055AEm, c1819185b);
                InterfaceC142616cN interfaceC142616cN2 = c224099ut2.A01;
                C150686qP c150686qP = c150486px.A00;
                c150686qP.A0A.execute(new C85W(c23310AUv, c150686qP, interfaceC142616cN2));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        bcr.CuC(str);
        A0A(null);
    }

    public C211499Wy(InterfaceC178207vu interfaceC178207vu) {
        super.A00 = interfaceC178207vu;
        this.A02 = new C23399AYy(this);
    }
}
