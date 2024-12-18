package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.BaseJavaModule;
import java.io.File;

/* renamed from: X.Ozl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56324Ozl implements InterfaceC69913Ca {
    public final int A00;
    public final Object A01;

    public C56324Ozl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        AbstractC59962oe abstractC59962oe;
        switch (this.A00) {
            case 0:
                R3M reactApplicationContext = ((BaseJavaModule) this.A01).getReactApplicationContext();
                Bundle A0b = AbstractC166987dD.A0b();
                Activity A01 = reactApplicationContext.A01();
                if (A01 == null) {
                    return;
                }
                A01.startActivityForResult(intent, i, A0b);
                return;
            case 1:
                C14360o3.A0B(intent, 0);
                abstractC59962oe = ((OCU) this.A01).A00;
                break;
            case 2:
                C14360o3.A0B(intent, 0);
                abstractC59962oe = ((C54771OIk) this.A01).A00;
                break;
            default:
                C14360o3.A0B(intent, 0);
                C12260kU.A08(((OBJ) this.A01).A00, intent, i);
                return;
        }
        C12260kU.A06(abstractC59962oe, intent, i);
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void CKE(Intent intent) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv3(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv4(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void En7(File file, int i) {
    }
}
