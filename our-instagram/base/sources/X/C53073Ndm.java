package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.music.common.ui.LoadingSpinnerView;
import java.text.DateFormat;
import java.util.List;

/* renamed from: X.Ndm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53073Ndm extends AbstractC51174MjI {
    public static final String __redex_internal_original_name = "ClipsDraftsSeeAllListAdapter";
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final Activity A03;
    public final Context A04;
    public final Fragment A05;
    public final UserSession A06;
    public final C54595O9w A07;
    public final C1809080s A08;
    public final C75E A09;
    public final C23031Ai A0A;
    public final N5T A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final boolean A0H;

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        C3OO c3oo;
        C3OO c3oo2;
        C14360o3.A0B(viewGroup, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ClipsDraftsSeeAllListAdapter.onCreateViewHolder", 2082136204);
        }
        try {
            if (i != 0) {
                if (i == 1) {
                    boolean A1a = AbstractC31178DnM.A1a(this.A0G);
                    int i3 = R.layout.gallery_drafts_list_item;
                    if (A1a) {
                        i3 = R.layout.gallery_drafts_list_item_no_nested_layout;
                    }
                    View inflate = LayoutInflater.from(this.A04).inflate(i3, viewGroup, false);
                    int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    UserSession userSession = this.A06;
                    C14360o3.A0A(inflate);
                    C53072Ndl c53072Ndl = new C53072Ndl(inflate, userSession);
                    C0fQ.A00(new ViewOnClickListenerC55468OkN(c53072Ndl, this, 67), ((AbstractC51356MmH) c53072Ndl).A05);
                    C0fQ.A00(new ViewOnClickListenerC55468OkN(c53072Ndl, this, 68), c53072Ndl.itemView);
                    c3oo = c53072Ndl;
                    if (Systrace.A0E(1L)) {
                        i2 = 532895409;
                        c3oo2 = c53072Ndl;
                        C0fO.A00(i2);
                        c3oo = c3oo2;
                    }
                    return c3oo;
                }
                throw AbstractC31175DnJ.A0U("Invalid view type ", i);
            }
            IgdsListCell A0Z = AbstractC31174DnI.A0Z(this.A04);
            A0Z.A06(2131955470);
            A0Z.setTextCellType(EnumC53237Nga.A04);
            A0Z.A05(R.drawable.instagram_clock_pano_outline_24);
            ViewOnClickListenerC55463OkI.A00(A0Z, 41, this);
            C3OO c3oo3 = new C3OO(A0Z);
            c3oo = c3oo3;
            if (Systrace.A0E(1L)) {
                i2 = 1039891918;
                c3oo2 = c3oo3;
                C0fO.A00(i2);
                c3oo = c3oo2;
            }
            return c3oo;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1181120102);
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C53073Ndm(Activity activity, Context context, Fragment fragment, UserSession userSession, C1809080s c1809080s, C75E c75e, N5T n5t, int i, int i2, boolean z) {
        super(activity, context, fragment, userSession, n5t, i, i2, z);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        AbstractC167007dF.A1F(userSession, 1, context);
        C14360o3.A0B(c75e, 9);
        C14360o3.A0B(A00, 11);
        this.A06 = userSession;
        this.A05 = fragment;
        this.A03 = activity;
        this.A04 = context;
        this.A08 = c1809080s;
        this.A0B = n5t;
        this.A09 = c75e;
        this.A0A = A00;
        this.A07 = new C54595O9w();
        this.A0H = true;
        this.A0E = C57537PgB.A00(this, 32);
        this.A0C = C57537PgB.A00(this, 30);
        this.A0G = C57537PgB.A00(this, 34);
        this.A0D = C57537PgB.A00(this, 31);
        this.A0F = AbstractC09440dt.A00(EnumC09460dv.A02, new C57537PgB(this, 33));
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        MY0 my0;
        String string;
        DateFormat A01;
        int i2;
        List list;
        C1809080s c1809080s;
        EnumC199188rL enumC199188rL;
        Long l;
        String str;
        int i3 = i;
        C14360o3.A0B(c3oo, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ClipsDraftsSeeAllListAdapter.onBindViewHolder", -1055571639);
        }
        try {
            if (getItemViewType(i3) == 1) {
                C53072Ndl c53072Ndl = (C53072Ndl) c3oo;
                if (this.A02) {
                    i3 = i - 1;
                }
                C9J0 c9j0 = (C9J0) super.A0B.get(i3);
                C14360o3.A0B(c53072Ndl, 0);
                C14360o3.A0B(c9j0, 1);
                C9J0 c9j02 = ((AbstractC51356MmH) c53072Ndl).A00;
                ((AbstractC51356MmH) c53072Ndl).A00 = c9j0;
                LoadingSpinnerView loadingSpinnerView = c53072Ndl.A09;
                if (c9j0.A0F) {
                    my0 = MY0.A02;
                } else {
                    my0 = MY0.A03;
                }
                loadingSpinnerView.setLoadingStatus(my0);
                RoundedCornerImageView roundedCornerImageView = c53072Ndl.A06;
                roundedCornerImageView.setImageDrawable(null);
                Context context = this.A04;
                roundedCornerImageView.setPlaceHolderColor(AbstractC167007dF.A09(context, R.attr.igds_color_secondary_background));
                C56258Oy5 c56258Oy5 = new C56258Oy5(c53072Ndl);
                ((AbstractC51356MmH) c53072Ndl).A01 = c56258Oy5;
                super.A08.A01(c56258Oy5, ((AbstractC51356MmH) c53072Ndl).A00);
                ((AbstractC51356MmH) c53072Ndl).A06.setVisibility(AbstractC167007dF.A05(((AbstractC51356MmH) c53072Ndl).A00.A0G ? 1 : 0));
                C9J0 c9j03 = ((AbstractC51356MmH) c53072Ndl).A00;
                if (!C14360o3.A0K(c9j02, c9j03)) {
                    ((AbstractC51356MmH) c53072Ndl).A02 = null;
                }
                AbstractC51174MjI.A02(c53072Ndl, this);
                if (((AbstractC51356MmH) c53072Ndl).A02 == null) {
                    A0J.A00(super.A04, super.A07, C05F.A0Y).A02(super.A09.getViewLifecycleOwner(), c9j03.A09, new C30184DRp(43, c53072Ndl, c9j03, this));
                }
                TextView textView = c53072Ndl.A03;
                C9J0 c9j04 = ((AbstractC51356MmH) c53072Ndl).A00;
                long j = c9j04.A01;
                long j2 = j + 10000;
                long j3 = c9j04.A02;
                C55050Oa1 c55050Oa1 = C55050Oa1.A00;
                Activity activity = this.A03;
                if (j2 > j3) {
                    string = c55050Oa1.A01(activity, j);
                } else {
                    C14360o3.A0B(activity, 0);
                    int intValue = C55050Oa1.A00(j3, System.currentTimeMillis()).intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue == 2) {
                                A01 = MSZ.A0N(activity).A02();
                                i2 = 2131955465;
                            } else {
                                A01 = MSZ.A0N(activity).A03();
                                i2 = 2131955463;
                            }
                        } else {
                            A01 = MSZ.A0N(activity).A01();
                            i2 = 2131955466;
                        }
                        string = activity.getString(i2, AbstractC43593JPy.A10(A01, j3));
                    } else {
                        string = activity.getString(2131955464);
                    }
                    C14360o3.A07(string);
                }
                textView.setText(string);
                TextView textView2 = c53072Ndl.A02;
                textView2.setText(((AbstractC51356MmH) c53072Ndl).A00.A0B);
                String str2 = ((AbstractC51356MmH) c53072Ndl).A00.A0B;
                if (str2 != null && str2.length() > 0) {
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
                InterfaceC09390do interfaceC09390do = this.A0D;
                boolean A1a = AbstractC31178DnM.A1a(interfaceC09390do);
                TextView textView3 = c53072Ndl.A07;
                if (A1a) {
                    textView3.setVisibility(8);
                    c53072Ndl.A00.setVisibility(8);
                    textView3 = c53072Ndl.A04;
                    textView3.setVisibility(0);
                }
                textView3.setText(AbstractC189358aC.A01(((AbstractC51356MmH) c53072Ndl).A00.A00));
                if (AbstractC31178DnM.A1a(this.A0C) && (l = ((AbstractC51356MmH) c53072Ndl).A00.A06) != null) {
                    long longValue = l.longValue();
                    if (longValue > 0) {
                        if (AbstractC31178DnM.A1a(interfaceC09390do)) {
                            c53072Ndl.A01.setVisibility(0);
                        }
                        TextView textView4 = c53072Ndl.A05;
                        textView4.setVisibility(0);
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        double d = longValue;
                        if (longValue <= 1048576) {
                            A1C.append(StringFormatUtil.formatStrLocaleSafe("%.1f", Double.valueOf(d / 1024.0d)));
                            str = " KB";
                        } else {
                            A1C.append(StringFormatUtil.formatStrLocaleSafe("%.1f", Double.valueOf(d / 1048576.0d)));
                            str = " MB";
                        }
                        textView4.setText(AbstractC166997dE.A0x(str, A1C));
                    }
                }
                if (i3 == 0 && !this.A01) {
                    View A06 = AbstractC31171DnF.A06(c53072Ndl);
                    ImageView imageView = ((AbstractC51356MmH) c53072Ndl).A05;
                    C9J0 c9j05 = ((AbstractC51356MmH) c53072Ndl).A00;
                    int ordinal = ((EnumC53127Nef) this.A0F.getValue()).ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            if (c9j05.A04 == C5JK.A05 && !this.A0A.A01.getBoolean("has_seen_share_to_direct_draft_tooltip", false) && C1LE.A0C(this.A06)) {
                                this.A01 = this.A08.A01(A06, imageView, EnumC199188rL.A0X);
                            } else {
                                if (AbstractC167007dF.A1Z(this.A0E) && !this.A0A.A01.getBoolean("has_seen_draft_scheduling_tooltip", false) && !C151866sW.A07(this.A06)) {
                                    c1809080s = this.A08;
                                    enumC199188rL = EnumC199188rL.A0W;
                                } else if (!this.A0A.A01.getBoolean("has_seen_draft_naming_tooltip", false)) {
                                    c1809080s = this.A08;
                                    enumC199188rL = EnumC199188rL.A0V;
                                }
                                c1809080s.A01(A06, imageView, enumC199188rL);
                            }
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        C23031Ai c23031Ai = this.A0A;
                        if (!AbstractC167017dG.A1b(c23031Ai, c23031Ai.A7K, C23031Ai.A8c, 270) && (((list = (List) this.A09.A01.A02()) == null || AbstractC166987dD.A1b(list)) && !this.A00)) {
                            C146106i8 A0K = AbstractC31171DnF.A0K();
                            A0K.A0D = context.getText(2131955444);
                            A0K.A01 = -1;
                            A0K.A0L = true;
                            AbstractC31175DnJ.A0l(context, A0K, 2131968948);
                            A0K.A0A(new P3G(this, 6));
                            Drawable drawable = context.getDrawable(R.drawable.instagram_info_pano_outline_24);
                            if (drawable != null) {
                                A0K.A02();
                                A0K.A08(drawable, context.getColor(R.color.igds_icon_on_color));
                            }
                            C31349DqE A00 = A0K.A00();
                            super.A02 = A00;
                            AbstractC166997dE.A1O(C41451vu.A01, A00);
                            this.A00 = true;
                        }
                    }
                }
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(1581691720);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-975676355);
            }
            throw th;
        }
    }

    @Override // X.AbstractC51174MjI, X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1487478599);
        int itemCount = super.getItemCount() + (this.A02 ? 1 : 0);
        C0f9.A0A(-770436305, A03);
        return itemCount;
    }

    @Override // X.AbstractC51174MjI, X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        long A00;
        int A03 = C0f9.A03(-162747003);
        if (getItemViewType(i) != 0) {
            if (this.A02) {
                i--;
            }
            A00 = super.getItemId(i);
        } else {
            A00 = super.A06.A00("0");
        }
        C0f9.A0A(-1519331509, A03);
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r4 != 0) goto L6;
     */
    @Override // X.C2UU, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemViewType(int r4) {
        /*
            r3 = this;
            r0 = 2138163898(0x7f71caba, float:3.2139656E38)
            int r2 = X.C0f9.A03(r0)
            boolean r0 = r3.A02
            if (r0 == 0) goto Le
            r1 = 0
            if (r4 == 0) goto Lf
        Le:
            r1 = 1
        Lf:
            r0 = 1606713447(0x5fc48067, float:2.831886E19)
            X.C0f9.A0A(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53073Ndm.getItemViewType(int):int");
    }
}
