package X;

import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.util.Iterator;

/* renamed from: X.3xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88923xt {
    public final Iterator A00;
    public final InterfaceC88913xs A01;
    public final InterfaceC38001pk A02;
    public final InterfaceC38631qu A03;
    public final SamplingPolicyConfig A04;
    public final Integer A05;

    public final void A00() {
        Iterator it = this.A00;
        if (it.hasNext()) {
            InterfaceC89033y5 interfaceC89033y5 = (InterfaceC89033y5) it.next();
            C89093yB c89093yB = new C89093yB(interfaceC89033y5, this.A05);
            InterfaceC38001pk interfaceC38001pk = this.A02;
            SamplingPolicyConfig samplingPolicyConfig = this.A04;
            interfaceC38001pk.FDA(new C89103yC(interfaceC89033y5, this.A01, this.A03, samplingPolicyConfig), c89093yB);
            return;
        }
        throw new IllegalStateException("No more batches to upload");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C88923xt(InterfaceC88913xs interfaceC88913xs, InterfaceC38001pk interfaceC38001pk, InterfaceC38631qu interfaceC38631qu, SamplingPolicyConfig samplingPolicyConfig, Integer num, Iterator it) {
        this.A02 = interfaceC38001pk;
        this.A05 = num;
        this.A00 = it;
        this.A01 = interfaceC88913xs;
        this.A04 = samplingPolicyConfig;
        this.A03 = interfaceC38631qu == null ? new Object() : interfaceC38631qu;
        if (it != null) {
        } else {
            throw new IllegalArgumentException("mBatchPayloadIterator is null");
        }
    }
}
