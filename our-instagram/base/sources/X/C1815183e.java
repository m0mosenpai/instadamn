package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.common.session.UserSession;

/* renamed from: X.83e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1815183e extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ GalleryPickerServiceDataSource A01;
    public final /* synthetic */ InterfaceC142616cN A02;
    public final /* synthetic */ AnonymousClass830 A03;
    public final /* synthetic */ C1813282k A04;
    public final /* synthetic */ IgCameraEffectsController A05;
    public final /* synthetic */ InterfaceC149836oc A06;
    public final /* synthetic */ C83J A07;
    public final /* synthetic */ UserSession A08;
    public final /* synthetic */ C1810981l A09;
    public final /* synthetic */ C83C A0A;
    public final /* synthetic */ C81J A0B;
    public final /* synthetic */ C83I A0C;
    public final /* synthetic */ C1813582n A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ InterfaceC09390do A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815183e(Context context, GalleryPickerServiceDataSource galleryPickerServiceDataSource, InterfaceC142616cN interfaceC142616cN, AnonymousClass830 anonymousClass830, C1813282k c1813282k, IgCameraEffectsController igCameraEffectsController, InterfaceC149836oc interfaceC149836oc, C83J c83j, UserSession userSession, C1810981l c1810981l, C83C c83c, C81J c81j, C83I c83i, C1813582n c1813582n, String str, InterfaceC09390do interfaceC09390do) {
        super(0);
        this.A00 = context;
        this.A08 = userSession;
        this.A03 = anonymousClass830;
        this.A02 = interfaceC142616cN;
        this.A0E = str;
        this.A0D = c1813582n;
        this.A09 = c1810981l;
        this.A01 = galleryPickerServiceDataSource;
        this.A0A = c83c;
        this.A0B = c81j;
        this.A0C = c83i;
        this.A07 = c83j;
        this.A06 = interfaceC149836oc;
        this.A04 = c1813282k;
        this.A05 = igCameraEffectsController;
        this.A0F = interfaceC09390do;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A00;
        UserSession userSession = this.A08;
        AnonymousClass830 anonymousClass830 = this.A03;
        GalleryPickerServiceDataSource galleryPickerServiceDataSource = this.A01;
        C83C c83c = this.A0A;
        C81J c81j = this.A0B;
        C172007lV c172007lV = c81j.A0e;
        C172017lW c172017lW = c81j.A0c;
        C83I c83i = this.A0C;
        C83J c83j = this.A07;
        return new C1815383g(context, galleryPickerServiceDataSource, anonymousClass830, this.A04, this.A05, this.A06, c83j, userSession, c172017lW, c172007lV, c83c, c83i, this.A0F);
    }
}
