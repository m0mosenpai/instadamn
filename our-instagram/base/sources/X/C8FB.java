package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.List;

/* renamed from: X.8FB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FB implements InterfaceC1829489p {
    public int A00 = -1;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final UserSession A05;
    public final C183688Ct A06;
    public final C8FC A07;
    public final InteractiveDrawableContainer A08;

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cud(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cuq() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cur() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cvp(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCJ(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCK(float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCL(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQa(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQk() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Din(Drawable drawable, float f, float f2, float f3, float f4) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dmk(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DuD() {
    }

    public C8FB(Context context, UserSession userSession, C183688Ct c183688Ct, InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A04 = context;
        this.A05 = userSession;
        this.A06 = c183688Ct;
        this.A08 = interactiveDrawableContainer;
        interactiveDrawableContainer.A0v(this);
        this.A07 = new C8FC((C8D0) null, (C8FD) null, (C89G) null, C05F.A01, (Integer) null, (Integer) null, (Object) "StickerOverlayController", (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1, true, false, true, true, false, false, false, true, true, true, true, true, false, false);
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, X.AlA] */
    public static void A00(C5GJ c5gj, C148276lx c148276lx, C8FB c8fb) {
        Drawable A01;
        EnumC150226pU A00 = c148276lx.A00();
        EnumC150226pU enumC150226pU = EnumC150226pU.A0q;
        String A002 = AbstractC111324zv.A00(2305);
        if (A00 == enumC150226pU) {
            C148286ly c148286ly = (C148286ly) c148276lx.A0O.get(0);
            Context context = c8fb.A04;
            String str = "";
            String str2 = c148286ly.A0X;
            String str3 = c148286ly.A0R;
            String str4 = c148276lx.A0I;
            if (str4 != null) {
                str = str4;
            }
            ?? obj = new Object();
            obj.A02 = str2;
            obj.A01 = str3;
            obj.A00 = str;
            obj.A03 = "";
            A01 = new C202548xY(context, obj);
            C183688Ct c183688Ct = c8fb.A06;
            c183688Ct.A1t.A0v((InterfaceC1829489p) c183688Ct.A1h.get());
        } else if (c148276lx.A0Z.equals(A002)) {
            UserSession userSession = c8fb.A05;
            Context context2 = c8fb.A04;
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(context2, 2);
            StoryPromptTappableData storyPromptTappableData = c148276lx.A01;
            if (storyPromptTappableData == null || (A01 = AbstractC226059yO.A00(context2, storyPromptTappableData, userSession, "")) == null) {
                return;
            }
        } else {
            A01 = C194808jg.A01(c8fb.A04, c8fb.A05, c148276lx);
        }
        if (c148276lx.A00().equals(EnumC150226pU.A0F)) {
            C8FC c8fc = c8fb.A07;
            c8fc.A0P = true;
            Float f = c148276lx.A0D;
            if (f != null) {
                c8fc.A01 = f.floatValue();
            }
            Float f2 = c148276lx.A0C;
            if (f2 != null) {
                c8fc.A00 = f2.floatValue();
            }
        } else if (c148276lx.A0Z.equals(A002)) {
            C8FC c8fc2 = c8fb.A07;
            c8fc2.A0P = true;
            c8fc2.A01 = 0.25f;
            c8fc2.A00 = 1.5f;
        }
        C183688Ct c183688Ct2 = c8fb.A06;
        C8FC c8fc3 = c8fb.A07;
        C150286pc c150286pc = c183688Ct2.A1h;
        int A0w = ((C8NW) c150286pc.get()).A0w(A01, c5gj, null, c8fc3, null, c148276lx.A0Z, null, null, null, c148276lx.A01());
        if (c148276lx.A00() == enumC150226pU) {
            C8NW c8nw = (C8NW) c150286pc.get();
            if (A01 instanceof C202548xY) {
                C8NW.A0W(c8nw, (C202548xY) A01);
            }
        }
        c8fb.A00 = A0w;
        InteractiveDrawableContainer interactiveDrawableContainer = c8fb.A08;
        c8fb.A03 = interactiveDrawableContainer.A0S;
        interactiveDrawableContainer.A0S = true;
    }

    public final void A01(final C5GJ c5gj, String str) {
        if (this.A00 == -1 && !this.A01) {
            UserSession userSession = this.A05;
            C148276lx c148276lx = (C148276lx) AbstractC149786oX.A00(userSession).A00.get(str);
            if (c148276lx != null) {
                A00(c5gj, c148276lx, this);
                return;
            }
            if (c5gj == C5GJ.MAP_LOCATION_STICKER) {
                C1P1 c1p1 = new C1P1() { // from class: X.9gL
                    @Override // X.C1P1
                    public final void onFinish() {
                        int A03 = C0f9.A03(1633124081);
                        this.A01 = false;
                        C0f9.A0A(-353215802, A03);
                    }

                    @Override // X.C1P1
                    public final void onStart() {
                        int A03 = C0f9.A03(520881549);
                        this.A01 = true;
                        C0f9.A0A(-1779820573, A03);
                    }

                    @Override // X.C1P1
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                        int A03 = C0f9.A03(-1413548585);
                        int A032 = C0f9.A03(1039087595);
                        C148276lx c148276lx2 = ((C214349eY) obj).A00;
                        if (c148276lx2 != null) {
                            C8FB.A00(c5gj, c148276lx2, this);
                        }
                        C0f9.A0A(-313101239, A032);
                        C0f9.A0A(-363554220, A03);
                    }
                };
                C14360o3.A0B(userSession, 0);
                C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                c25621Ms.A06();
                c25621Ms.A0L("creatives/get_sticker/%s/", str);
                c25621Ms.A0R(C214349eY.class, C23032ADo.class);
                c25621Ms.A9s("isLocationLocked", "true");
                C1ON A0N = c25621Ms.A0N();
                A0N.A00 = c1p1;
                C1GJ.A03(A0N);
                return;
            }
            C6C0.A01(new C1P1() { // from class: X.9gM
                @Override // X.C1P1
                public final void onFinish() {
                    int A03 = C0f9.A03(-76175499);
                    this.A01 = false;
                    C0f9.A0A(-1305051152, A03);
                }

                @Override // X.C1P1
                public final void onStart() {
                    int A03 = C0f9.A03(492523267);
                    this.A01 = true;
                    C0f9.A0A(1323777388, A03);
                }

                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    int A03 = C0f9.A03(-1648700819);
                    int A032 = C0f9.A03(-1881999322);
                    C148276lx c148276lx2 = ((C214359eZ) obj).A00;
                    if (c148276lx2 != null) {
                        C8FB.A00(c5gj, c148276lx2, this);
                    }
                    C0f9.A0A(1571876643, A032);
                    C0f9.A0A(-1945493901, A03);
                }
            }, userSession, str);
        }
    }

    @Override // X.InterfaceC1829489p
    public final void Dep(Drawable drawable, int i, boolean z) {
        if (i == this.A00) {
            this.A00 = -1;
            if (this.A02) {
                this.A08.A0S = this.A03;
            }
        }
    }
}
