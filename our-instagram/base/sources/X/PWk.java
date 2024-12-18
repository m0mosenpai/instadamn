package X;

import com.facebook.avatar.expresso.odr.ODRController;
import com.instagram.pendingmedia.service.impl.MediaUploader;

/* loaded from: classes9.dex */
public final class PWk extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public final int A0D;
    public final Object A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWk(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A0D = i;
        this.A0E = obj;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A0D;
        this.A0C = obj;
        this.A03 |= Integer.MIN_VALUE;
        if (i != 0) {
            return ((MediaUploader) this.A0E).A01(null, null, null, this);
        }
        return ODRController.A01((ODRController) this.A0E, null, null, null, null, this);
    }
}
