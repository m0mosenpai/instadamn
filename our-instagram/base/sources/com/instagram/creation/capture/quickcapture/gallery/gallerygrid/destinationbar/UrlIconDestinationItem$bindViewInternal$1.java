package com.instagram.creation.capture.quickcapture.gallery.gallerygrid.destinationbar;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AbstractC24771Iv;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.C0eB;
import X.C180677zv;
import X.C1JX;
import X.C218379l9;
import X.C57160PZe;
import X.C9Rz;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.MC7;
import android.graphics.Bitmap;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.gallery.gallerygrid.destinationbar.UrlIconDestinationItem$bindViewInternal$1", f = "UrlIconDestinationItem.kt", i = {}, l = {JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class UrlIconDestinationItem$bindViewInternal$1 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C180677zv A03;
    public final /* synthetic */ C218379l9 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlIconDestinationItem$bindViewInternal$1(UserSession userSession, C180677zv c180677zv, C218379l9 c218379l9, InterfaceC23621Ds interfaceC23621Ds, float f) {
        super(1, interfaceC23621Ds);
        this.A04 = c218379l9;
        this.A02 = userSession;
        this.A01 = f;
        this.A03 = c180677zv;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        C218379l9 c218379l9 = this.A04;
        return new UrlIconDestinationItem$bindViewInternal$1(this.A02, this.A03, c218379l9, interfaceC23621Ds, this.A01);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((UrlIconDestinationItem$bindViewInternal$1) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C9Rz c9Rz;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C218379l9 c218379l9 = this.A04;
            UserSession userSession = this.A02;
            this.A00 = 1;
            obj = AnonymousClass194.A00(this, new C57160PZe(userSession, c218379l9, (InterfaceC23621Ds) null, 3, 42));
            if (obj == c1jx) {
                return c1jx;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            c9Rz = new C9Rz(bitmap, null, this.A01, 15);
        } else {
            c9Rz = null;
        }
        return AbstractC23641Du.A04(AnonymousClass191.A00, new MC7(c9Rz, this.A03, this.A04, null, 33), AbstractC24771Iv.A00());
    }
}
