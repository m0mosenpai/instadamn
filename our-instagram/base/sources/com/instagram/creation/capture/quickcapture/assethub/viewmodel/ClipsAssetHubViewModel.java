package com.instagram.creation.capture.quickcapture.assethub.viewmodel;

import X.AnonymousClass057;
import X.C05F;
import X.C10M;
import X.C14360o3;
import X.C148276lx;
import X.C193578hc;
import X.C49602Pt;
import X.InterfaceC06180Ui;
import X.InterfaceC15070pN;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes4.dex */
public final class ClipsAssetHubViewModel extends C193578hc {
    public static File A0B;
    public Drawable A00;
    public C148276lx A01;
    public boolean A02;
    public final Context A03;
    public final InterfaceC06180Ui A04;
    public final InterfaceC06180Ui A05;
    public final InterfaceC06180Ui A06;
    public final InterfaceC15070pN A07;
    public final InterfaceC15070pN A08;
    public final InterfaceC15070pN A09;
    public final C49602Pt A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsAssetHubViewModel(Application application, C49602Pt c49602Pt) {
        super(application);
        C14360o3.A0B(c49602Pt, 2);
        this.A0A = c49602Pt;
        Application application2 = super.A00;
        C14360o3.A0C(application2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        this.A03 = application2.getApplicationContext();
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A05 = A00;
        this.A08 = A00;
        AnonymousClass057 A002 = C10M.A00(num, 0, 0);
        this.A04 = A002;
        this.A07 = A002;
        AnonymousClass057 A003 = C10M.A00(num, 0, 0);
        this.A06 = A003;
        this.A09 = A003;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel r10, X.InterfaceC23621Ds r11) {
        /*
            r3 = 33
            boolean r0 = X.MAG.A01(r11, r3)
            if (r0 == 0) goto L67
            r8 = r11
            X.MAG r8 = (X.MAG) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r8.A00 = r2
        L16:
            java.lang.Object r1 = r8.A02
            X.1JX r7 = X.C1JX.A02
            int r0 = r8.A00
            r9 = 1
            if (r0 == 0) goto L27
            if (r0 != r9) goto L6d
            java.lang.Object r5 = r8.A01
            X.AbstractC09560e7.A00(r1)
        L26:
            return r5
        L27:
            X.AbstractC09560e7.A00(r1)
            X.12L r2 = X.C12L.A00
            r1 = 1335631354(0x4f9c1dfa, float:5.2384205E9)
            r0 = 2
            X.0nZ r6 = r2.AOT(r1, r0)
            X.2Pt r0 = r10.A0A
            java.io.File r1 = r0.C5c()
            java.lang.String r0 = "clips_asset_hub_placeholder_photo.jpg"
            java.io.File r5 = new java.io.File
            r5.<init>(r1, r0)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L54
            long r3 = r5.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L54
            com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel.A0B = r5
            return r5
        L54:
            r2 = 0
            r1 = 15
            X.B5g r0 = new X.B5g
            r0.<init>(r5, r10, r2, r1)
            r8.A01 = r5
            r8.A00 = r9
            java.lang.Object r0 = X.AbstractC23641Du.A00(r8, r6, r0)
            if (r0 != r7) goto L26
            return r7
        L67:
            X.MAG r8 = new X.MAG
            r8.<init>(r10, r11, r3)
            goto L16
        L6d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel.A00(com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel, X.1Ds):java.lang.Object");
    }
}
