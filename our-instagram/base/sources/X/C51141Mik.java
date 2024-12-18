package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import java.util.List;
import java.util.Map;

/* renamed from: X.Mik, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51141Mik extends C2UU {
    public Map A01;
    public final float A02;
    public final Context A03;
    public final OKE A04;
    public final O2A A05;
    public List A00 = C16930sl.A00;
    public final Map A06 = AbstractC166987dD.A1I();
    public final InterfaceC09390do A07 = C57521Pfv.A00(this, 20);

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C51371MmW(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.layout_stacked_timeline_volume_controls_item, false), this, this.A04);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        IgTextView igTextView;
        View view;
        IgTextView igTextView2;
        String A0t;
        Integer A01;
        C51371MmW c51371MmW = (C51371MmW) c3oo;
        C14360o3.A0B(c51371MmW, 0);
        C51631MrO c51631MrO = (C51631MrO) this.A00.get(i);
        C14360o3.A0B(c51631MrO, 1);
        c51371MmW.A03 = c51631MrO;
        O2A o2a = c51631MrO.A03;
        String str = "";
        if (o2a instanceof NIG) {
            c51371MmW.A06.setVisibility(0);
            IgImageView igImageView = c51371MmW.A02;
            AbstractC38055Goi.A00(igImageView, c51631MrO.A02, null);
            igImageView.setVisibility(0);
            IgTextView igTextView3 = c51371MmW.A08;
            igTextView3.setText(c51631MrO.A07);
            igTextView3.setVisibility(0);
            IgTextView igTextView4 = c51371MmW.A07;
            String str2 = c51631MrO.A06;
            if (str2 != null) {
                str = str2;
            }
            igTextView4.setText(str);
            igTextView4.setVisibility(0);
        } else {
            if (o2a instanceof NIH) {
                c51371MmW.A06.setVisibility(0);
                c51371MmW.A02.setVisibility(8);
                C51141Mik c51141Mik = c51371MmW.A0D;
                O2A o2a2 = c51141Mik.A05;
                IgTextView igTextView5 = c51371MmW.A08;
                Context context = c51141Mik.A03;
                Resources resources = context.getResources();
                int i2 = 2131955342;
                if (o2a2 == null) {
                    i2 = 2131955343;
                }
                AbstractC31173DnH.A19(resources, igTextView5, i2);
                igTextView5.setVisibility(0);
                if (o2a2 == null) {
                    igTextView2 = c51371MmW.A07;
                    A0t = context.getResources().getString(2131955344);
                } else {
                    int A0B = AbstractC166987dD.A0B(c51141Mik.A02, 100.0f);
                    if (A0B < 100) {
                        igTextView2 = c51371MmW.A07;
                        A0t = AbstractC43594JPz.A0t(context.getResources(), A0B, 2131955345);
                    }
                    igTextView = c51371MmW.A07;
                }
                igTextView2.setText(A0t);
                igTextView = c51371MmW.A07;
            } else {
                if (C14360o3.A0K(o2a, NIL.A00)) {
                    if (c51631MrO.A00 == -1.0f) {
                        view = c51371MmW.A06;
                        view.setVisibility(8);
                    }
                } else if (!C14360o3.A0K(o2a, NII.A00) && !C14360o3.A0K(o2a, NIJ.A00)) {
                    if (C14360o3.A0K(o2a, NIK.A00)) {
                        c51371MmW.A06.setVisibility(0);
                        c51371MmW.A02.setVisibility(8);
                        IgTextView igTextView6 = c51371MmW.A08;
                        igTextView6.setText(c51631MrO.A07);
                        igTextView6.setVisibility(0);
                        igTextView = c51371MmW.A07;
                        if (c51631MrO.A01) {
                            String str3 = c51631MrO.A06;
                            if (str3 != null) {
                                str = str3;
                            }
                        } else {
                            str = c51371MmW.A0D.A03.getResources().getString(2131955286);
                            C14360o3.A0A(str);
                        }
                        igTextView.setText(str);
                    } else {
                        throw B4Z.A00();
                    }
                }
                c51371MmW.A06.setVisibility(0);
                c51371MmW.A02.setVisibility(8);
                IgTextView igTextView7 = c51371MmW.A08;
                igTextView7.setText(c51631MrO.A07);
                igTextView7.setVisibility(0);
                view = c51371MmW.A07;
                view.setVisibility(8);
            }
            igTextView.setVisibility(0);
            igTextView.setMaxLines(Integer.MAX_VALUE);
        }
        float f = c51631MrO.A00;
        c51371MmW.A01 = f;
        if (f == 0.0f) {
            A01 = C51371MmW.A00(c51371MmW);
        } else {
            A01 = C51371MmW.A01(c51371MmW);
        }
        C51371MmW.A04(c51371MmW, A01);
        IgEditSeekBar igEditSeekBar = c51371MmW.A0C;
        igEditSeekBar.setOnSliderChangeListener(new C56781PHy(c51371MmW, c51371MmW.A0D, c51631MrO, i));
        IgImageView igImageView2 = c51371MmW.A0A;
        AbstractC13880nE.A0o(igImageView2, c51371MmW.A05, R.dimen.abc_edit_text_inset_top_material);
        OkD.A00(igImageView2, c51631MrO, c51371MmW, i, 1);
        C51371MmW.A03(c51371MmW, o2a, c51371MmW.A01);
        igEditSeekBar.setEnabled(c51631MrO.A01);
    }

    public C51141Mik(Context context, OKE oke, O2A o2a, float f) {
        this.A03 = context;
        this.A04 = oke;
        this.A05 = o2a;
        this.A02 = f;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1229726250);
        int size = this.A00.size();
        C0f9.A0A(974093896, A03);
        return size;
    }
}
