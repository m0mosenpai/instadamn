package X;

import java.util.Queue;

/* renamed from: X.SuH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63823SuH implements InterfaceC65477Tku {
    public static final C62997SaL A01 = new C62997SaL(C62997SaL.A04, 2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final SVQ A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ SFV AEj(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        SZW szw;
        SZW szw2;
        SZW szw3;
        SZW szw4;
        C63732Ssm c63732Ssm = (C63732Ssm) obj;
        SVQ svq = this.A00;
        if (svq != null) {
            Queue queue = SZW.A01;
            synchronized (queue) {
                szw = (SZW) queue.poll();
                szw2 = szw;
            }
            if (szw == null) {
                szw2 = new Object();
            }
            szw2.A00 = c63732Ssm;
            C62750SPb c62750SPb = svq.A00;
            Object A00 = c62750SPb.A00(szw2);
            synchronized (queue) {
                queue.offer(szw2);
            }
            C63732Ssm c63732Ssm2 = (C63732Ssm) A00;
            if (c63732Ssm2 == null) {
                synchronized (queue) {
                    szw3 = (SZW) queue.poll();
                    szw4 = szw3;
                }
                if (szw3 == null) {
                    szw4 = new Object();
                }
                szw4.A00 = c63732Ssm;
                c62750SPb.A03(szw4, c63732Ssm);
            } else {
                c63732Ssm = c63732Ssm2;
            }
        }
        return new SFV(c63732Ssm, new C63772StS(c63732Ssm, AbstractC166987dD.A0H(c63729Ssj.A00(A01))));
    }

    public C63823SuH(SVQ svq) {
        this.A00 = svq;
    }

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ boolean CKb(Object obj) {
        return true;
    }

    public C63823SuH() {
        this(null);
    }
}
