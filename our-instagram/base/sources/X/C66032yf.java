package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66032yf extends AbstractC65632xz implements InterfaceC66042yg {
    public final Fragment A00;
    public final UserSession A01;
    public final Context A02;
    public final InterfaceC60442pS A03;

    public C66032yf(Context context, Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(fragment, 2);
        this.A02 = context;
        this.A00 = fragment;
        this.A01 = userSession;
        this.A03 = interfaceC60442pS;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass306, 0);
        anonymousClass306.A7a(0);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "PendingMedia";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        C47Z c47z = (C47Z) obj;
        return Arrays.hashCode(new Object[]{c47z.A35, c47z.A3t, c47z.A1f});
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Throwable illegalStateException;
        int i2;
        List list;
        int A03 = C0f9.A03(1077417297);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        if (view.getTag() != null) {
            if (i != 0) {
                if (i == 1) {
                    Object tag = view.getTag();
                    C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.pendingmedia.PendingMediaContainerViewBinder.Holder");
                    C49383LsH c49383LsH = (C49383LsH) tag;
                    C47Z c47z = (C47Z) obj;
                    UserSession userSession = this.A01;
                    C14360o3.A0B(c49383LsH, 0);
                    C14360o3.A0B(c47z, 1);
                    C14360o3.A0B(userSession, 2);
                    c49383LsH.A07 = c47z;
                    ArrayList arrayList = new ArrayList(c47z.A4O);
                    int size = arrayList.size();
                    List<User> BOY = C0BQ.A00(userSession).BOY();
                    ArrayList arrayList2 = new ArrayList();
                    for (User user : BOY) {
                        if (arrayList.contains(user.getId())) {
                            arrayList2.add(user);
                        }
                    }
                    LinearLayout linearLayout = c49383LsH.A05;
                    linearLayout.removeAllViews();
                    View view2 = c49383LsH.A02;
                    linearLayout.addView(view2);
                    View[] viewArr = new View[size];
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        arrayList2.get(i3);
                        viewArr[i3] = C55184Odp.A00(c49383LsH.A00, userSession);
                        linearLayout.addView(viewArr[i3]);
                        View view3 = viewArr[i3];
                        if (view3 != null) {
                            int i4 = 8;
                            if (c49383LsH.A08) {
                                i4 = 0;
                            }
                            view3.setVisibility(i4);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    int dimensionPixelSize = c49383LsH.A00.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
                    String str = c47z.A33;
                    if (str != null) {
                        c49383LsH.A03.setImageBitmap(C1NC.A0E(str, dimensionPixelSize, dimensionPixelSize));
                    }
                    boolean A11 = c47z.A11();
                    ImageView imageView = c49383LsH.A04;
                    if (A11) {
                        imageView.setBackgroundResource(R.drawable.grid_camera_icon_small);
                    } else {
                        imageView.setBackground(null);
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        View view4 = viewArr[i5];
                        if (view4 != null && view4.getTag() != null) {
                            Object tag2 = view4.getTag();
                            C14360o3.A0C(tag2, MSV.A00(530));
                            C55184Odp.A01(userSession, this, null, (P6K) tag2, c47z);
                        }
                    }
                    C47Z c47z2 = c49383LsH.A07;
                    if (c47z2 != null && (list = c47z2.A4O) != null) {
                        int size3 = new ArrayList(list).size();
                        StringBuilder sb = new StringBuilder();
                        if (size3 != 0) {
                            Integer valueOf = Integer.valueOf(size3);
                            String string = c49383LsH.A00.getResources().getString(2131969470, AbstractC13670mt.A06("(%d/%d)", valueOf, valueOf));
                            C14360o3.A07(string);
                            sb.append(string);
                        }
                        c49383LsH.A06.setText(sb.toString());
                    }
                    C0fQ.A00(new ViewOnClickListenerC48043LOp(c49383LsH, viewArr), view2);
                } else {
                    illegalStateException = new UnsupportedOperationException();
                    i2 = -231125295;
                }
            } else {
                Object tag3 = view.getTag();
                C14360o3.A0C(tag3, MSV.A00(530));
                P6K p6k = (P6K) tag3;
                FragmentActivity requireActivity = this.A00.requireActivity();
                UserSession userSession2 = this.A01;
                p6k.A01 = AbstractC193608hg.A00(requireActivity, userSession2);
                C55184Odp.A01(userSession2, this, this, p6k, (C47Z) obj);
            }
            C0f9.A0A(-692693054, A03);
            return;
        }
        illegalStateException = new IllegalStateException("holder in PendingMediaBinderGroup cannot be null!");
        i2 = 1624742386;
        C0f9.A0A(i2, A03);
        throw illegalStateException;
    }

    @Override // X.InterfaceC66042yg
    public final void D4N(C38321qM c38321qM) {
        EnumC72436Xdg enumC72436Xdg;
        C3DN A00;
        String id = c38321qM.getId();
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            View view = fragment.mView;
            if (view != null) {
                AbstractC13880nE.A0O(view);
            }
            if (id != null) {
                C2EY A002 = AbstractC40650I0i.A00(c38321qM);
                if (c38321qM.A5b()) {
                    enumC72436Xdg = EnumC72436Xdg.A0G;
                } else {
                    enumC72436Xdg = EnumC72436Xdg.A07;
                }
                C28501Zl c28501Zl = C28531Zo.A04.A02;
                UserSession userSession = this.A01;
                InterfaceC60442pS interfaceC60442pS = this.A03;
                C34726FRp A07 = c28501Zl.A07(interfaceC60442pS, userSession, A002);
                A07.A06(id);
                A07.A07.putSerializable(AbstractC111324zv.A00(152), enumC72436Xdg);
                if (interfaceC60442pS != null) {
                    A07.A04(interfaceC60442pS);
                }
                DirectShareSheetFragment A003 = A07.A00();
                FragmentActivity activity = fragment.getActivity();
                if (activity != null && (A00 = C3DN.A00.A00(activity)) != null) {
                    A00.A0K(A003);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.LsH, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A00;
        int A03 = C0f9.A03(1221661082);
        if (i != 0) {
            if (i == 1) {
                Context context = this.A02;
                C14360o3.A0B(context, 0);
                ?? obj = new Object();
                obj.A00 = context;
                View inflate = LayoutInflater.from(context).inflate(R.layout.layout_cross_posting_pengding_media, (ViewGroup) null, false);
                obj.A02 = inflate;
                obj.A03 = (ImageView) inflate.requireViewById(R.id.row_header_imageview);
                obj.A06 = (TextView) obj.A02.requireViewById(R.id.row_header_textview);
                obj.A04 = (ImageView) obj.A02.requireViewById(R.id.row_header_imageview_overlay);
                obj.A01 = obj.A02.requireViewById(R.id.row_header_caret);
                LinearLayout linearLayout = new LinearLayout(obj.A00);
                obj.A05 = linearLayout;
                linearLayout.setOrientation(1);
                obj.A05.addView(obj.A02);
                obj.A05.setTag(obj);
                A00 = obj.A05;
            } else {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                C0f9.A0A(-140234789, A03);
                throw unsupportedOperationException;
            }
        } else {
            Context context2 = this.A02;
            UserSession userSession = this.A01;
            C17060sy.A01.A01(userSession);
            A00 = C55184Odp.A00(context2, userSession);
        }
        C0f9.A0A(1726454498, A03);
        return A00;
    }
}
