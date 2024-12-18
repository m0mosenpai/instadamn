package X;

import java.nio.charset.Charset;

/* renamed from: X.PuJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58379PuJ implements InterfaceC65182TfQ {
    public static final InterfaceC65465Tkh A01 = new C58380PuK();
    public final InterfaceC65465Tkh A00;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.PuW, X.Tkh, java.lang.Object] */
    public C58379PuJ() {
        InterfaceC65465Tkh interfaceC65465Tkh;
        C58381PuL c58381PuL = C58381PuL.A00;
        try {
            interfaceC65465Tkh = (InterfaceC65465Tkh) AbstractC58321PtD.A0q("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory");
        } catch (Exception unused) {
            interfaceC65465Tkh = A01;
        }
        InterfaceC65465Tkh[] interfaceC65465TkhArr = {c58381PuL, interfaceC65465Tkh};
        ?? obj = new Object();
        obj.A00 = interfaceC65465TkhArr;
        Charset charset = AbstractC58376PuG.A03;
        this.A00 = obj;
    }
}
