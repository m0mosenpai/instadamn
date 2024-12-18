package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.89C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89C extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewStub A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C3I9 A04;
    public final /* synthetic */ CameraConfiguration A05;
    public final /* synthetic */ TargetViewSizeProvider A06;
    public final /* synthetic */ C88D A07;
    public final /* synthetic */ C1814382v A08;
    public final /* synthetic */ InterfaceC1810081c A09;
    public final /* synthetic */ C81L A0A;
    public final /* synthetic */ DirectCameraViewModel A0B;
    public final /* synthetic */ AnonymousClass878 A0C;
    public final /* synthetic */ InteractiveDrawableContainer A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89C(View view, View view2, ViewStub viewStub, UserSession userSession, C3I9 c3i9, CameraConfiguration cameraConfiguration, TargetViewSizeProvider targetViewSizeProvider, C88D c88d, C1814382v c1814382v, InterfaceC1810081c interfaceC1810081c, C81L c81l, DirectCameraViewModel directCameraViewModel, AnonymousClass878 anonymousClass878, InteractiveDrawableContainer interactiveDrawableContainer) {
        super(0);
        this.A08 = c1814382v;
        this.A00 = view;
        this.A0D = interactiveDrawableContainer;
        this.A01 = view2;
        this.A02 = viewStub;
        this.A04 = c3i9;
        this.A03 = userSession;
        this.A0A = c81l;
        this.A0B = directCameraViewModel;
        this.A09 = interfaceC1810081c;
        this.A0C = anonymousClass878;
        this.A07 = c88d;
        this.A06 = targetViewSizeProvider;
        this.A05 = cameraConfiguration;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C1814382v c1814382v = this.A08;
        View view = this.A00;
        InteractiveDrawableContainer interactiveDrawableContainer = this.A0D;
        View view2 = this.A01;
        ViewStub viewStub = this.A02;
        C3I9 c3i9 = this.A04;
        UserSession userSession = this.A03;
        C81L c81l = this.A0A;
        DirectCameraViewModel directCameraViewModel = this.A0B;
        InterfaceC1810081c interfaceC1810081c = this.A09;
        AnonymousClass878 anonymousClass878 = this.A0C;
        C88D c88d = this.A07;
        return new C8LD(view, view2, viewStub, userSession, c3i9, this.A05, this.A06, c88d, c1814382v, interfaceC1810081c, c81l, directCameraViewModel, anonymousClass878, interactiveDrawableContainer);
    }
}
