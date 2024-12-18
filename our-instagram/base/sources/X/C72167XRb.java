package X;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;

/* renamed from: X.XRb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72167XRb extends AbstractC40081tZ {
    @Override // X.AbstractC40081tZ
    public final /* bridge */ /* synthetic */ AbstractC41001v7 A06(AbstractC41001v7 abstractC41001v7, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AbstractC40721uf A02 = C40021tT.A01().A02(byteArrayOutputStream);
        if (A02.A0B(this)) {
            Iterator it = this.A07.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("onBatchCreated");
            }
            return new C72166XRa(A02, this, byteArrayOutputStream);
        }
        throw AbstractC166987dD.A14("Couldn't lock newly created batch");
    }

    @Override // X.AbstractC40081tZ
    public final /* bridge */ /* synthetic */ Object A07() {
        AbstractC41001v7 abstractC41001v7 = this.A02;
        if (abstractC41001v7 == null) {
            return null;
        }
        return ((C72166XRa) abstractC41001v7).A00;
    }
}
