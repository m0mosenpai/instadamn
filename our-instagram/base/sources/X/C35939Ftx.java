package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ftx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35939Ftx implements InterfaceC65642y0 {
    public final Context A00;
    public final UserSession A01;
    public final Fragment A02;
    public final InterfaceC11380iw A03;
    public final GBX A04;
    public final boolean A05;

    @Override // X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "CreatorLegacyProfileHeader";
    }

    @Override // X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return 0;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return 0;
    }

    @Override // X.InterfaceC65642y0
    public final String getViewSubTypeName(int i, Object obj) {
        return null;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 3;
    }

    @Override // X.InterfaceC65642y0
    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
    }

    @Override // X.InterfaceC65642y0
    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
    }

    @Override // X.InterfaceC65642y0
    public final void onViewRecycled(View view, int i, Object obj, Object obj2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x012d, code lost:
    
        if (r11 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        if (r0 == 4) goto L11;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r36, android.view.View r37, java.lang.Object r38, java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 1237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35939Ftx.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
        anonymousClass306.A7a(1);
        if (C72U.A01(this.A00, this.A01, ((C155696yy) obj).A0E, false)) {
            anonymousClass306.A7a(2);
        }
    }

    @Override // X.InterfaceC65642y0
    public final String getViewTypeName(int i) {
        return AnonymousClass001.A06(i, "CreatorLegacyProfileHeader", "[", "]");
    }

    public C35939Ftx(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, GBX gbx, boolean z) {
        this.A02 = fragment;
        this.A00 = fragment.requireContext();
        this.A01 = userSession;
        this.A05 = z;
        this.A04 = gbx;
        this.A03 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        int i2;
        int A03 = C0f9.A03(-227243732);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Context context = this.A00;
                    C14360o3.A0B(viewGroup, 1);
                    inflate = LayoutInflater.from(context).inflate(R.layout.row_profile_action_group, viewGroup, false);
                    ViewGroup A0C = AbstractC31176DnK.A0C(inflate, R.id.action_group);
                    int i3 = context.getResources().getConfiguration().screenLayout & 15;
                    int i4 = 3;
                    if (i3 == 3 || i3 == 4) {
                        i4 = 4;
                    }
                    FMF fmf = new FMF(A0C, i4);
                    int i5 = 0;
                    while (true) {
                        View[] viewArr = fmf.A01;
                        int length = viewArr.length;
                        if (i5 >= length) {
                            break;
                        }
                        int i6 = R.layout.text_action_item;
                        if (i5 == 0) {
                            i6 = R.layout.text_action_item_view_switcher;
                        }
                        View inflate2 = LayoutInflater.from(context).inflate(i6, A0C, false);
                        AbstractC13880nE.A0W(inflate2, AbstractC167017dG.A0C(context));
                        viewArr[i5] = inflate2;
                        A0C.addView(viewArr[i5]);
                        viewArr[i5].setVisibility(8);
                        if (i5 != length - 1) {
                            View[] viewArr2 = fmf.A02;
                            View inflate3 = LayoutInflater.from(context).inflate(R.layout.vertical_divider, A0C, false);
                            AbstractC13880nE.A0W(inflate3, context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material));
                            viewArr2[i5] = inflate3;
                            A0C.addView(viewArr2[i5]);
                            viewArr2[i5].setVisibility(8);
                        }
                        i5++;
                    }
                    View inflate4 = LayoutInflater.from(context).inflate(R.layout.text_action_more, A0C, false);
                    AbstractC13880nE.A0W(inflate4, AbstractC167017dG.A0C(context));
                    fmf.A00 = inflate4;
                    A0C.addView(inflate4);
                    fmf.A00.setVisibility(8);
                    inflate.setTag(fmf);
                    i2 = -791893326;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException();
                    C0f9.A0A(1468064184, A03);
                    throw illegalStateException;
                }
            } else {
                inflate = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), null, R.layout.row_profile_header_bio);
                inflate.setTag(new FON(inflate));
                i2 = -675358817;
            }
        } else {
            Context context2 = this.A00;
            UserSession userSession = this.A01;
            inflate = LayoutInflater.from(context2).inflate(R.layout.row_profile_header, (ViewGroup) null, false);
            inflate.setTag(new GBD(new C1568472m((ViewGroup) inflate.findViewById(R.id.avatar_container), userSession), new FOX(inflate)));
            i2 = -1230161597;
        }
        C0f9.A0A(i2, A03);
        return inflate;
    }

    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(-356849162);
        if (view == null) {
            view = createView(i, viewGroup);
        }
        bindView(i, view, obj, obj2);
        C0f9.A0A(-830498597, A03);
        return view;
    }
}
