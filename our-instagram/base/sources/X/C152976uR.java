package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.6uR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152976uR extends AbstractC65632xz {
    public InterfaceC152866uG A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C53Q A06;
    public final C38N A07;
    public final C38U A08;
    public final String A09;
    public final String A0A;
    public final RunnableC152986uS A0B = new RunnableC152986uS();
    public float A00 = -1.0f;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return String.valueOf(obj.hashCode()).hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        UserSession userSession = this.A05;
        C153126ug c153126ug = (C153126ug) obj;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c153126ug, 1);
        int[] iArr = new int[c153126ug.A01()];
        int A01 = c153126ug.A01();
        for (int i2 = 0; i2 < A01; i2++) {
            iArr[i2] = AbstractC153386v7.A00(userSession, (C38321qM) c153126ug.A02(i2));
        }
        return Arrays.hashCode(iArr);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int dimensionPixelSize;
        int i2;
        int A03 = C0f9.A03(-23781959);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        C14360o3.A0B(obj2, 3);
        C153126ug c153126ug = (C153126ug) obj;
        C153336v2 c153336v2 = (C153336v2) obj2;
        int A032 = C0f9.A03(-1911978276);
        UserSession userSession = this.A05;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.ui.rows.mediagrid.MediaGridRowViewBinder.Holder");
        C81263jw c81263jw = (C81263jw) tag;
        boolean z = c153336v2.A04;
        int i3 = c153336v2.A00;
        float f = this.A00;
        Map map = c153336v2.A02;
        C38N c38n = this.A07;
        C53Q c53q = this.A06;
        InterfaceC152866uG interfaceC152866uG = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A04;
        String str = this.A09;
        boolean z2 = this.A03;
        boolean z3 = this.A02;
        String str2 = this.A0A;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c81263jw, 1);
        C14360o3.A0B(c153126ug, 2);
        C14360o3.A0B(interfaceC11380iw, 11);
        View view2 = c81263jw.A00;
        if (z) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = view2.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        }
        AbstractC13880nE.A0Y(view2, dimensionPixelSize);
        view2.setImportantForAccessibility(2);
        IgMultiImageButton[] igMultiImageButtonArr = c81263jw.A01;
        int i4 = 0;
        do {
            IgMultiImageButton igMultiImageButton = igMultiImageButtonArr[i4];
            if (igMultiImageButton != null) {
                float f2 = 1.0f;
                if (z2) {
                    f2 = 0.75f;
                }
                ((ConstrainedImageView) igMultiImageButton).A00 = f2;
                if (i4 < c153126ug.A01()) {
                    C38321qM c38321qM = (C38321qM) c153126ug.A02(i4);
                    int i5 = (i3 * 3) + i4;
                    if (c38321qM.A5M() && map != null && map.containsKey(c38321qM.getId())) {
                        i2 = ((Number) map.getOrDefault(c38321qM.getId(), -1)).intValue();
                    } else {
                        i2 = 0;
                    }
                    AbstractC153416vB.A02(interfaceC11380iw, userSession, c38321qM, c53q, c38n, interfaceC152866uG, igMultiImageButton, str, str2, f, i4, i3, i5, i2, true, z3, z2);
                } else {
                    AbstractC153386v7.A04(igMultiImageButton);
                }
            }
            i4++;
        } while (i4 < 3);
        C0f9.A0A(-467267781, A032);
        C0f9.A0A(1650049050, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C38321qM c38321qM;
        C153126ug c153126ug = (C153126ug) obj;
        C153336v2 c153336v2 = (C153336v2) obj2;
        if (anonymousClass306 != null) {
            anonymousClass306.A7a(0);
        }
        if (this.A01 != null) {
            Integer num = null;
            if (c153126ug != null) {
                num = Integer.valueOf(c153126ug.A01());
            }
            if (num != null) {
                int intValue = num.intValue();
                for (int i = 0; i < intValue; i++) {
                    InterfaceC152866uG interfaceC152866uG = this.A01;
                    if (interfaceC152866uG != null) {
                        if (c153126ug != null && (c38321qM = (C38321qM) c153126ug.A02(i)) != null) {
                            if (c153336v2 != null) {
                                int i2 = c153336v2.A00;
                                if (Integer.valueOf(i2) != null) {
                                    interfaceC152866uG.AAn(c38321qM, (i2 * 3) + i);
                                }
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C152976uR(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C53Q c53q, C38N c38n, C38U c38u, String str, String str2) {
        this.A05 = userSession;
        this.A07 = c38n;
        this.A06 = c53q;
        this.A08 = c38u;
        this.A04 = interfaceC11380iw;
        this.A09 = str;
        this.A0A = str2;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1663739926);
        C14360o3.A0B(viewGroup, 1);
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        RunnableC152986uS runnableC152986uS = this.A0B;
        View inflate = LayoutInflater.from(context).inflate(R.layout.grid_row_container, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        C81263jw c81263jw = new C81263jw(viewGroup2);
        viewGroup2.setId(R.id.media_set_row_content_identifier);
        int i2 = 0;
        while (true) {
            boolean z = true;
            do {
                IgMultiImageButton igMultiImageButton = new IgMultiImageButton(context, null, 0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                if (z) {
                    layoutParams.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing));
                }
                igMultiImageButton.setLayoutParams(layoutParams);
                if (runnableC152986uS != null) {
                    igMultiImageButton.setCoordinator(runnableC152986uS);
                }
                c81263jw.A01[i2] = igMultiImageButton;
                viewGroup2.addView(igMultiImageButton);
                i2++;
                if (i2 < 3) {
                    z = false;
                } else {
                    viewGroup2.setTag(c81263jw);
                    C0f9.A0A(-2033872621, A03);
                    return viewGroup2;
                }
            } while (i2 >= 2);
        }
    }
}
