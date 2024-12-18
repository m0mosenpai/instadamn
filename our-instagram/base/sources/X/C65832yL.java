package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;
import com.instagram.util.recyclerview.LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;

/* renamed from: X.2yL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65832yL extends AbstractC65632xz {
    public ViewOnClickListenerC693639w A00;
    public C693439u A01;
    public C685736u A02;
    public LinearLayoutManager A03;
    public final UserSession A04;
    public final Context A05;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "BusinessConversionNetego";
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 4;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C123675ig c123675ig = (C123675ig) obj;
        C42664IuL c42664IuL = (C42664IuL) obj2;
        ViewOnClickListenerC693639w viewOnClickListenerC693639w = this.A00;
        viewOnClickListenerC693639w.getClass();
        String str = c42664IuL.A04;
        viewOnClickListenerC693639w.A00 = c123675ig;
        viewOnClickListenerC693639w.A01 = str;
        if (c42664IuL.Ceb()) {
            anonymousClass306.A7a(3);
            return;
        }
        this.A02.getClass();
        anonymousClass306.A7a(0);
        this.A02.A02(c123675ig, c42664IuL, 0);
        anonymousClass306.A7a(1);
        this.A02.A02(c123675ig, c42664IuL, 1);
        anonymousClass306.A7a(2);
        this.A02.A02(c123675ig, c42664IuL, 2);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((C123675ig) obj).getId().hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(AnonymousClass001.A0O("Could not get ViewModel hash for item type ", i));
        }
        return Integer.MIN_VALUE;
    }

    public C65832yL(Context context, UserSession userSession) {
        this.A05 = context;
        this.A04 = userSession;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        View.OnClickListener onClickListener;
        View view2;
        int A03 = C0f9.A03(1874703526);
        final C123675ig c123675ig = (C123675ig) obj;
        final C42664IuL c42664IuL = (C42664IuL) obj2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C693439u c693439u = this.A01;
                        c693439u.getClass();
                        c693439u.A01(view, this.A04, c123675ig, c42664IuL);
                        C0f9.A0A(483696769, A03);
                    }
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AbstractC111324zv.A00(342));
                    C0f9.A0A(-1593404327, A03);
                    throw unsupportedOperationException;
                }
                Object tag = view.getTag();
                tag.getClass();
                this.A02.getClass();
                onClickListener = this.A00;
                onClickListener.getClass();
                TextView textView = ((CAM) tag).A00;
                textView.setText(((H2U) c123675ig.A00).A03);
                view2 = textView;
            } else {
                Object tag2 = view.getTag();
                tag2.getClass();
                C33587Esz c33587Esz = (C33587Esz) tag2;
                Context context = this.A05;
                C685736u c685736u = this.A02;
                c685736u.getClass();
                UserSession userSession = this.A04;
                C14360o3.A0B(c33587Esz, 1);
                C14360o3.A0B(context, 2);
                C14360o3.A0B(userSession, 4);
                HorizontalRecyclerPager horizontalRecyclerPager = c33587Esz.A00;
                horizontalRecyclerPager.A14(new E0F(userSession, c33587Esz));
                C2UU c2uu = horizontalRecyclerPager.A0A;
                if (c2uu == null) {
                    horizontalRecyclerPager.setAdapter(new C66418UGm(context, horizontalRecyclerPager, C08730cb.A00(userSession).A00(), c685736u));
                } else if (c2uu instanceof C66418UGm) {
                    c2uu.notifyDataSetChanged();
                }
                C685736u c685736u2 = this.A02;
                c685736u2.getClass();
                C14360o3.A0B(c123675ig, 0);
                C63762ux c63762ux = c685736u2.A0M;
                C57112jm c57112jm = c63762ux.A00;
                C63622uj c63622uj = c63762ux.A01;
                String id = c123675ig.getId();
                id.getClass();
                c57112jm.A05(view, c63622uj.A00(AnonymousClass001.A0b(id, ":", i)));
                C0f9.A0A(483696769, A03);
            }
        } else {
            Object tag3 = view.getTag();
            tag3.getClass();
            CAO cao = (CAO) tag3;
            String str = ((H2U) c123675ig.A00).A05;
            final C685736u c685736u3 = this.A02;
            c685736u3.getClass();
            onClickListener = new View.OnClickListener() { // from class: X.IiH
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C685736u c685736u4 = c685736u3;
                    C123675ig c123675ig2 = c123675ig;
                    C42664IuL c42664IuL2 = c42664IuL;
                    c42664IuL2.getPosition();
                    C42592ItB c42592ItB = new C42592ItB(c123675ig2, c42664IuL2);
                    Context requireContext = c685736u4.A0O.requireContext();
                    C41083IHa c41083IHa = new C41083IHa(c42592ItB, c42664IuL2, c685736u4);
                    InterfaceC60442pS interfaceC60442pS = c685736u4.A0K;
                    UserSession userSession2 = c685736u4.A0J;
                    C1M1 c1m1 = c685736u4.A0N;
                    C14360o3.A0B(interfaceC60442pS, 4);
                    AbstractC167017dG.A1T(userSession2, c1m1);
                    DialogInterfaceOnClickListenerC41814IfU dialogInterfaceOnClickListenerC41814IfU = new DialogInterfaceOnClickListenerC41814IfU(0, c41083IHa, c1m1, userSession2, c123675ig2, interfaceC60442pS, c42664IuL2);
                    C193328hC A0I = AbstractC31171DnF.A0I(requireContext);
                    A0I.A0Z(dialogInterfaceOnClickListenerC41814IfU, EnumC193348hE.A05, AbstractC166997dE.A0q(requireContext.getResources(), 2131963556), true);
                    AbstractC31178DnM.A1R(A0I, true);
                }
            };
            cao.A01.setText(str);
            view2 = cao.A00;
        }
        C0fQ.A00(onClickListener, view2);
        C685736u c685736u22 = this.A02;
        c685736u22.getClass();
        C14360o3.A0B(c123675ig, 0);
        C63762ux c63762ux2 = c685736u22.A0M;
        C57112jm c57112jm2 = c63762ux2.A00;
        C63622uj c63622uj2 = c63762ux2.A01;
        String id2 = c123675ig.getId();
        id2.getClass();
        c57112jm2.A05(view, c63622uj2.A00(AnonymousClass001.A0b(id2, ":", i)));
        C0f9.A0A(483696769, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.CAO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.CAM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.Esz, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int i2;
        View view;
        int A03 = C0f9.A03(-724925529);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        i2 = -123025758;
                        view = C693539v.A00(this.A05, viewGroup, "v1", 1);
                    } else {
                        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                        C0f9.A0A(1880211942, A03);
                        throw unsupportedOperationException;
                    }
                } else {
                    Context context = viewGroup.getContext();
                    View inflate = LayoutInflater.from(context).inflate(R.layout.blue_button_footer, viewGroup, false);
                    inflate.setBackgroundColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.backgroundColorSecondary)));
                    View requireViewById = inflate.requireViewById(R.id.footer_view);
                    ?? obj = new Object();
                    obj.A00 = (TextView) requireViewById.requireViewById(R.id.footer_text_view);
                    inflate.setTag(obj);
                    i2 = 1714492135;
                    view = inflate;
                }
            } else {
                Context context2 = this.A05;
                LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 A00 = AbstractC92774Dp.A00(context2, this.A03, null);
                this.A03 = A00;
                A00.A12(true);
                C14360o3.A0B(viewGroup, 0);
                C14360o3.A0B(context2, 1);
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.business_netego_carousel, viewGroup, false);
                C14360o3.A0A(inflate2);
                C14360o3.A0B(inflate2, 1);
                ?? obj2 = new Object();
                View findViewById = inflate2.findViewById(R.id.business_netego_carousel_view);
                C14360o3.A07(findViewById);
                obj2.A00 = (HorizontalRecyclerPager) findViewById;
                int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
                int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_left_right_margin);
                HorizontalRecyclerPager horizontalRecyclerPager = obj2.A00;
                horizontalRecyclerPager.A10(new C3YB(dimensionPixelSize2, dimensionPixelSize));
                horizontalRecyclerPager.A01 = dimensionPixelSize2 - dimensionPixelSize;
                horizontalRecyclerPager.setLayoutManager(A00);
                inflate2.setTag(obj2);
                i2 = 146804371;
                view = inflate2;
            }
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.netego_title, viewGroup, false);
            ?? obj3 = new Object();
            obj3.A01 = (TextView) inflate3.requireViewById(R.id.title);
            obj3.A00 = inflate3.requireViewById(R.id.more_options_button);
            inflate3.setTag(obj3);
            i2 = -2063490658;
            view = inflate3;
        }
        C0f9.A0A(i2, A03);
        return view;
    }
}
