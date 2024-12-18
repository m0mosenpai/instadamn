package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Odp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55184Odp {
    public static final C55184Odp A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.common.session.UserSession r4, X.C66032yf r5, X.InterfaceC66042yg r6, X.P6K r7, X.C47Z r8) {
        /*
            r1 = 0
            X.AbstractC167007dF.A1K(r7, r8)
            X.47Z r0 = r7.A02
            if (r0 == 0) goto Lb
            r0.A0X(r7)
        Lb:
            r7.A02 = r8
            r7.A00 = r4
            boolean r0 = r8.A0t()
            r3 = 0
            if (r0 == 0) goto L27
            java.util.List r0 = r8.A0K()
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r1)
            X.47Z r0 = (X.C47Z) r0
            if (r0 == 0) goto L56
            java.lang.String r4 = r0.A33
        L24:
            if (r4 == 0) goto L56
            goto L2a
        L27:
            java.lang.String r4 = r8.A33
            goto L24
        L2a:
            android.widget.TextView r0 = r7.A0C     // Catch: android.content.res.Resources.NotFoundException -> L4c
            android.content.Context r2 = X.AbstractC166997dE.A0L(r0)     // Catch: android.content.res.Resources.NotFoundException -> L4c
            android.content.res.Resources r1 = r2.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L4c
            r0 = 2131165270(0x7f070056, float:1.7944752E38)
            r1.getDimensionPixelSize(r0)     // Catch: android.content.res.Resources.NotFoundException -> L4c
            X.0iw r2 = X.C150856qj.A02(r2)     // Catch: android.content.res.Resources.NotFoundException -> L4c
            if (r2 == 0) goto L56
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r7.A0D     // Catch: android.content.res.Resources.NotFoundException -> L4c
            java.lang.String r0 = "file://"
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r4)     // Catch: android.content.res.Resources.NotFoundException -> L4c
            X.AbstractC25235BEs.A1I(r2, r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L4c
            goto L56
        L4c:
            X.0wb r2 = X.C18950wb.A01
            r1 = 817890849(0x30c00621, float:1.3971581E-9)
            java.lang.String r0 = "Unable to load resource for pending media upload"
            r2.AEp(r0, r1)
        L56:
            boolean r0 = r8.A11()
            android.widget.ImageView r1 = r7.A09
            if (r0 == 0) goto L87
            r0 = 2131237474(0x7f081a62, float:1.80912E38)
            r1.setBackgroundResource(r0)
        L64:
            A02(r7)
            android.widget.ImageView r1 = r7.A0A
            r0 = 6
            X.ViewOnClickListenerC55455Ok9.A01(r1, r0, r7)
            android.widget.ImageView r1 = r7.A07
            r0 = 7
            X.ViewOnClickListenerC55455Ok9.A01(r1, r0, r7)
            com.instagram.igds.components.button.IgdsButton r1 = r7.A0E
            r0 = 30
            X.ViewOnClickListenerC55465OkK.A01(r1, r0, r6, r7)
            if (r5 == 0) goto L83
            android.widget.ImageView r1 = r7.A08
            r0 = 31
            X.ViewOnClickListenerC55465OkK.A01(r1, r0, r5, r7)
        L83:
            r8.A0W(r7)
            return
        L87:
            r1.setBackground(r3)
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55184Odp.A01(com.instagram.common.session.UserSession, X.2yf, X.2yg, X.P6K, X.47Z):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.widget.ProgressBar, android.view.View] */
    public static final void A02(P6K p6k) {
        ImageView imageView;
        IgdsButton igdsButton;
        int i;
        C115435Kd c115435Kd;
        C47Z c47z = p6k.A02;
        if (c47z != null) {
            p6k.A03.setOnClickListener(null);
            TextView textView = p6k.A0C;
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            textView.setPadding(0, 0, 0, 0);
            textView.setTypeface(null, 1);
            p6k.A05.setVisibility(0);
            if (!c47z.A0m() && c47z.A1f != EnumC915447k.A02) {
                C40131tg c40131tg = C40121td.A0G;
                Context A0L = AbstractC166997dE.A0L(textView);
                UserSession userSession = p6k.A00;
                if (userSession != null) {
                    c40131tg.A01(A0L, userSession);
                    C47Z c47z2 = p6k.A02;
                    if (c47z2 != null) {
                        p6k.A0B.setVisibility(8);
                        p6k.A06.setVisibility(0);
                        if (c47z2.A3D != null && (c115435Kd = c47z2.A6I) != null && c115435Kd.A00 == 403) {
                            p6k.A01();
                            return;
                        }
                        if (c47z2.A0y()) {
                            boolean A12 = c47z2.A12();
                            ImageView imageView2 = p6k.A0A;
                            if (A12) {
                                imageView2.setVisibility(8);
                                p6k.A04.setVisibility(8);
                                i = 2131969464;
                            } else {
                                imageView2.setVisibility(0);
                                p6k.A04.setVisibility(0);
                                i = 2131969471;
                            }
                            textView.setText(i);
                            p6k.A08.setVisibility(0);
                            imageView = p6k.A07;
                        } else {
                            p6k.A0A.setVisibility(8);
                            p6k.A04.setVisibility(8);
                            p6k.A08.setVisibility(8);
                            p6k.A07.setVisibility(0);
                            int i2 = 2131969472;
                            if (c47z2.A11()) {
                                i2 = 2131969481;
                            }
                            textView.setText(i2);
                            return;
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                p6k.A0A.setVisibility(8);
                p6k.A04.setVisibility(8);
                imageView = p6k.A07;
                imageView.setVisibility(8);
                p6k.A08.setVisibility(8);
                IgdsButton igdsButton2 = p6k.A0E;
                igdsButton2.setVisibility(8);
                int ordinal = c47z.A1f.ordinal();
                if (ordinal != 8) {
                    if (ordinal != 7) {
                        if (ordinal != 6) {
                            EnumC40111tc enumC40111tc = c47z.A1G;
                            EnumC40111tc enumC40111tc2 = EnumC40111tc.A0Q;
                            ?? r4 = p6k.A0B;
                            if (enumC40111tc == enumC40111tc2) {
                                r4.setIndeterminate(true);
                                r4.setBackgroundResource(R.drawable.upload_indeterminate_background);
                            } else {
                                r4.setIndeterminate(false);
                                r4.setBackground(null);
                                r4.setProgress(c47z.A03());
                            }
                            p6k.A06.setVisibility(8);
                            igdsButton = r4;
                            igdsButton.setVisibility(0);
                            return;
                        }
                        if (c47z.A0D() == ShareType.A0Q) {
                            imageView.setVisibility(0);
                            ProgressBar progressBar = p6k.A0B;
                            progressBar.setIndeterminate(true);
                            progressBar.setBackgroundResource(R.drawable.upload_indeterminate_background);
                            return;
                        }
                        A03(p6k);
                        p6k.A06.setVisibility(0);
                    }
                    A03(p6k);
                } else {
                    E72 e72 = c47z.A0m;
                    if (e72 != null && e72.A01) {
                        Boolean bool = c47z.A1v;
                        textView.setPadding(p6k.A0D.getPaddingLeft(), 0, 0, 0);
                        textView.setCompoundDrawables(null, null, null, null);
                        textView.setTypeface(null, 0);
                        int i3 = 2131975726;
                        if (AbstractC166997dE.A1Z(bool, false)) {
                            i3 = 2131975725;
                        }
                        textView.setText(i3);
                        p6k.A0B.setVisibility(8);
                    } else {
                        if (p6k.A00 != null && (c47z.A0v() || c47z.A0u())) {
                            UserSession userSession2 = p6k.A00;
                            if (userSession2 != null) {
                                if (AbstractC31178DnM.A1X(C06090Tz.A05, userSession2, 36326365238146898L)) {
                                    UserSession userSession3 = p6k.A00;
                                    if (userSession3 != null) {
                                        Resources resources = AbstractC166997dE.A0L(textView).getResources();
                                        InterfaceC02900Bo A002 = C0BQ.A00(userSession3);
                                        textView.setPadding(p6k.A0D.getPaddingLeft(), 0, 0, 0);
                                        textView.setCompoundDrawables(null, null, null, null);
                                        textView.setTypeface(null, 0);
                                        if (A002.CLL()) {
                                            C47Z c47z3 = p6k.A02;
                                            if (c47z3 != null) {
                                                if (c47z3.A4T.isEmpty()) {
                                                    MSZ.A11(resources, textView, AbstractC166997dE.A0Y(userSession3).getUsername(), 2131969477);
                                                    p6k.A0B.setVisibility(8);
                                                }
                                            } else {
                                                throw AbstractC166997dE.A0g();
                                            }
                                        }
                                        textView.setText(2131969478);
                                        p6k.A0B.setVisibility(8);
                                    }
                                    p6k.A06.setVisibility(0);
                                    igdsButton = igdsButton2;
                                    igdsButton.setVisibility(0);
                                    return;
                                }
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                        A03(p6k);
                    }
                }
                igdsButton = p6k.A06;
                igdsButton.setVisibility(0);
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A03(P6K p6k) {
        Drawable drawable;
        int i;
        Object[] objArr;
        TextView textView = p6k.A0C;
        Context A0L = AbstractC166997dE.A0L(textView);
        Resources resources = A0L.getResources();
        textView.setPadding(p6k.A0D.getPaddingLeft(), 0, 0, 0);
        C47Z c47z = p6k.A02;
        if (c47z != null) {
            if (AbstractC166987dD.A1b(c47z.A4T)) {
                UserSession userSession = p6k.A00;
                if (userSession != null) {
                    C56137Ovx A002 = AbstractC53982Ntt.A00(userSession);
                    String A0n = AbstractC31173DnH.A0n(A002.A03, C17060sy.A01);
                    C05A c05a = A002.A02;
                    int size = ((java.util.Set) c05a.getValue()).size();
                    Object value = c05a.getValue();
                    if (size == 1) {
                        String A003 = A002.A00((String) AbstractC001800i.A0E((Iterable) value, 0));
                        if (A003 != null) {
                            i = 2131963735;
                            objArr = new Object[]{A0n, A003};
                            String string = A0L.getString(i, objArr);
                            C14360o3.A07(string);
                            textView.setText(string);
                        }
                        i = 2131963734;
                        objArr = AbstractC25228BEl.A1Z(A0n, ((java.util.Set) c05a.getValue()).size());
                        String string2 = A0L.getString(i, objArr);
                        C14360o3.A07(string2);
                        textView.setText(string2);
                    } else {
                        if (((java.util.Set) value).size() == 2) {
                            String A004 = A002.A00((String) AbstractC001800i.A0E(AbstractC31172DnG.A0w(c05a), 0));
                            String A005 = A002.A00((String) AbstractC001800i.A0E(AbstractC31172DnG.A0w(c05a), 1));
                            if (A004 != null && A005 != null) {
                                i = 2131963736;
                                objArr = new Object[]{A0n, A004, A005};
                                String string22 = A0L.getString(i, objArr);
                                C14360o3.A07(string22);
                                textView.setText(string22);
                            }
                        }
                        i = 2131963734;
                        objArr = AbstractC25228BEl.A1Z(A0n, ((java.util.Set) c05a.getValue()).size());
                        String string222 = A0L.getString(i, objArr);
                        C14360o3.A07(string222);
                        textView.setText(string222);
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                Drawable drawable2 = A0L.getDrawable(R.drawable.instagram_check_pano_outline_24);
                if (drawable2 != null) {
                    drawable = drawable2.mutate();
                    if (drawable != null) {
                        AbstractC25231BEo.A0x(A0L, drawable, R.color.grey_5);
                    }
                } else {
                    drawable = null;
                }
                int i2 = -AbstractC166987dD.A0B(3.0f, resources.getDisplayMetrics().density);
                int i3 = -AbstractC166987dD.A0B(4.0f, resources.getDisplayMetrics().density);
                if (drawable != null) {
                    drawable.setBounds(i2, i3, drawable.getIntrinsicWidth() + i2, drawable.getIntrinsicHeight() + i3);
                }
                textView.setCompoundDrawables(drawable, null, null, null);
                textView.setText(2131969469);
            }
            p6k.A0B.setVisibility(8);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final View A00(Context context, UserSession userSession) {
        AbstractC167017dG.A1N(context, userSession);
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_pending_media, (ViewGroup) null);
        C14360o3.A0A(inflate);
        P6K p6k = new P6K(inflate);
        AbstractC56832jG.A00(p6k.A0A, AbstractC53242c7.A0F(context, R.attr.glyphColorSecondary), AbstractC53242c7.A0F(context, R.attr.glyphColorSecondaryActive), 77);
        AbstractC56832jG.A00(p6k.A08, AbstractC53242c7.A0F(context, R.attr.glyphColorSecondary), AbstractC53242c7.A0F(context, R.attr.glyphColorSecondaryActive), 77);
        AbstractC56832jG.A00(p6k.A07, AbstractC53242c7.A0F(context, R.attr.glyphColorSecondary), AbstractC53242c7.A0F(context, R.attr.glyphColorSecondaryActive), 77);
        ProgressBar progressBar = p6k.A0B;
        Drawable progressDrawable = progressBar.getProgressDrawable();
        if (progressDrawable != null) {
            String A002 = AbstractC111324zv.A00(28);
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            Context context2 = progressBar.getContext();
            Drawable drawable = context2.getDrawable(R.drawable.upload_track);
            if (drawable != null) {
                Q2Q q2q = new Q2Q(null, null);
                q2q.A00.A01 = drawable;
                drawable.setCallback(q2q);
                layerDrawable.setDrawableByLayerId(android.R.id.progress, q2q);
                int dimensionPixelSize = progressBar.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material);
                Drawable drawable2 = context2.getDrawable(R.drawable.progress_horizontal_upload);
                C14360o3.A0C(drawable2, A002);
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable2;
                layerDrawable2.setDrawableByLayerId(android.R.id.progress, new NFt(drawable, dimensionPixelSize));
                progressBar.setIndeterminateDrawable(layerDrawable2);
                inflate.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC44250Jgu(p6k, 4));
                inflate.setTag(p6k);
                return inflate;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
