package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;

/* loaded from: classes8.dex */
public final class KEZ extends AbstractC168697g3 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C38U A02;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.KzD, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int dimensionPixelSize;
        EnumC153466vG enumC153466vG;
        int A03 = C0f9.A03(863643740);
        Context context = viewGroup.getContext();
        View view2 = view;
        if (view == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            ?? obj3 = new Object();
            obj3.A00 = linearLayout;
            obj3.A01 = new IgMultiImageButton[3];
            int i2 = 0;
            loop0: while (true) {
                boolean z = true;
                do {
                    IgMultiImageButton igMultiImageButton = new IgMultiImageButton(context);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                    if (z) {
                        layoutParams.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing));
                    }
                    igMultiImageButton.setLayoutParams(layoutParams);
                    igMultiImageButton.setEnableTouchOverlay(false);
                    obj3.A01[i2] = igMultiImageButton;
                    linearLayout.addView(igMultiImageButton);
                    i2++;
                    if (i2 >= 3) {
                        break loop0;
                    }
                    z = false;
                } while (i2 >= 2);
            }
            linearLayout.setTag(obj3);
            view2 = linearLayout;
        }
        UserSession userSession = this.A01;
        C47545KzD c47545KzD = (C47545KzD) AbstractC31172DnG.A0x(view2);
        C153126ug c153126ug = (C153126ug) obj;
        boolean z2 = ((C153336v2) obj2).A04;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        View view3 = c47545KzD.A00;
        view3.getClass();
        int i3 = 0;
        if (z2) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = c47545KzD.A00.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        }
        AbstractC13880nE.A0Y(view3, dimensionPixelSize);
        while (true) {
            IgMultiImageButton[] igMultiImageButtonArr = c47545KzD.A01;
            igMultiImageButtonArr.getClass();
            if (i3 < igMultiImageButtonArr.length) {
                IgMultiImageButton igMultiImageButton2 = c47545KzD.A01[i3];
                if (i3 < c153126ug.A01()) {
                    KzE kzE = (KzE) c153126ug.A02(i3);
                    Object obj4 = null;
                    igMultiImageButton2.setColorFilter((ColorFilter) null);
                    igMultiImageButton2.setVisibility(0);
                    igMultiImageButton2.setImageAlpha(255);
                    igMultiImageButton2.setClickable(false);
                    igMultiImageButton2.setUrl(kzE.A01, interfaceC11380iw);
                    C47Z c47z = kzE.A00;
                    if (c47z != null) {
                        if (c47z.A0t()) {
                            enumC153466vG = EnumC153466vG.A08;
                        } else {
                            C47Z c47z2 = kzE.A00;
                            if (c47z2 != null) {
                                if (c47z2.A11()) {
                                    enumC153466vG = EnumC153466vG.A0N;
                                } else {
                                    if (!AbstractC1566271k.A0U(userSession, interfaceC11380iw.getModuleName())) {
                                        C47Z c47z3 = kzE.A00;
                                        if (c47z3 != null) {
                                            if (c47z3.A0s()) {
                                                enumC153466vG = EnumC153466vG.A0L;
                                            }
                                        } else {
                                            obj4.getClass();
                                            throw C00O.createAndThrow();
                                        }
                                    }
                                    igMultiImageButton2.A0H();
                                }
                            } else {
                                obj4.getClass();
                                throw C00O.createAndThrow();
                            }
                        }
                        igMultiImageButton2.setIcon(enumC153466vG);
                    } else {
                        obj4.getClass();
                        throw C00O.createAndThrow();
                    }
                } else {
                    AbstractC153386v7.A04(igMultiImageButton2);
                }
                i3++;
            } else {
                C0f9.A0A(-1554290233, A03);
                return view2;
            }
        }
    }

    public KEZ(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38U c38u) {
        this.A01 = userSession;
        this.A02 = c38u;
        this.A00 = interfaceC11380iw;
    }
}
