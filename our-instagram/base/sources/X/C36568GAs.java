package X;

import android.os.Bundle;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.GAs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36568GAs implements InterfaceC37176GZn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    @Override // X.InterfaceC37176GZn
    public final /* synthetic */ void Djb() {
    }

    public C36568GAs(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(C36568GAs c36568GAs) {
        switch (c36568GAs.A00) {
            case 0:
                C32705EaW.A01((Bundle) c36568GAs.A01, (C32705EaW) c36568GAs.A02);
                return;
            case 1:
                ((G4H) c36568GAs.A02).A01.A03(new MessageIdentifier(((C31200Dnj) c36568GAs.A01).A00, ""));
                return;
            default:
                ((G4A) c36568GAs.A02).A00.A02((MessageIdentifier) c36568GAs.A01);
                return;
        }
    }

    @Override // X.InterfaceC37176GZn
    public final void Das() {
        A00(this);
    }

    @Override // X.InterfaceC37176GZn
    public final void DxT() {
        A00(this);
    }
}
