package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.MjJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51175MjJ extends C2UU implements InterfaceC69543Ao {
    public List A00;
    public boolean A01;
    public final List A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final O46 A05;
    public final InterfaceC58059Pok A06;
    public final String A07;

    public C51175MjJ(InterfaceC11380iw interfaceC11380iw, UserSession userSession, O46 o46, InterfaceC58059Pok interfaceC58059Pok, String str) {
        AbstractC25233BEq.A0w(1, userSession, interfaceC58059Pok, o46);
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A06 = interfaceC58059Pok;
        this.A05 = o46;
        this.A07 = str;
        this.A02 = AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC69543Ao
    public final int CNP(Reel reel) {
        C14360o3.A0B(reel, 0);
        return this.A02.indexOf(reel);
    }

    @Override // X.InterfaceC69543Ao
    public final int CNQ(Reel reel, C41181vS c41181vS) {
        C14360o3.A0B(reel, 0);
        return this.A02.indexOf(reel);
    }

    @Override // X.InterfaceC69543Ao
    public final void EcN(List list, boolean z, UserSession userSession) {
        C14360o3.A0B(list, 0);
        AbstractC31175DnJ.A0x(this, list, this.A02);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    if (i != 3) {
                        return new C3OO(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.prompt_sticker_viewer_pagination_spinner, false));
                    }
                    View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.music_pick_empty_aggregation_item, viewGroup, false);
                    C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgLinearLayout");
                    return new C51263Mkm(inflate);
                }
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View inflate2 = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.music_pick_aggregation_scroll_item, viewGroup, false);
                C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.widget.HorizontalScrollView");
                return new C51262Mkl((HorizontalScrollView) inflate2);
            }
            int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            View inflate3 = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.prompt_sticker_viewer_disclaimer_text, viewGroup, false);
            C14360o3.A0C(inflate3, AbstractC43591JPw.A00(3));
            return new C51264Mkn((IgTextView) inflate3);
        }
        int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51322Mlj(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.prompt_participant_grid_item, false));
    }

    @Override // X.InterfaceC69543Ao
    public final Object Bla(int i) {
        return AbstractC001800i.A0O(this.A02, i);
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        int i2 = 1;
        if (this.A00 == null) {
            i2 = 0;
        }
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    if (itemViewType == 3) {
                        C51263Mkm c51263Mkm = (C51263Mkm) c3oo;
                        C14360o3.A0B(c51263Mkm, 0);
                        ImageView A0D = AbstractC31176DnK.A0D(c51263Mkm.A00, R.id.stack_album_drawable);
                        AbstractC166997dE.A19(A0D.getContext(), A0D, R.drawable.music_pick_aggregation_empty_state);
                        return;
                    }
                    return;
                }
                List list = this.A00;
                if (list == null) {
                    C14360o3.A0F("aggregationItems");
                } else {
                    C51262Mkl c51262Mkl = (C51262Mkl) c3oo;
                    O46 o46 = this.A05;
                    C14360o3.A0B(c51262Mkl, 1);
                    HorizontalScrollView horizontalScrollView = c51262Mkl.A00;
                    ViewGroup viewGroup = (ViewGroup) horizontalScrollView.findViewById(R.id.music_aggregation_container);
                    viewGroup.removeAllViews();
                    int i3 = 0;
                    for (Object obj : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC16960so.A1U();
                        } else {
                            InterfaceC58243Prn interfaceC58243Prn = (InterfaceC58243Prn) obj;
                            Context context = horizontalScrollView.getContext();
                            C14360o3.A07(context);
                            View inflate = View.inflate(context, R.layout.music_pick_aggregation_item, new LinearLayout(context));
                            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgLinearLayout");
                            ImageView A08 = AbstractC31171DnF.A08(inflate, R.id.album_art_container);
                            TextView A0e = AbstractC166987dD.A0e(inflate, R.id.aggregation_title);
                            TextView A0e2 = AbstractC166987dD.A0e(inflate, R.id.aggregation_subtitle);
                            TextView A0e3 = AbstractC166987dD.A0e(inflate, R.id.music_aggregation_count_label);
                            Context A0L = AbstractC166997dE.A0L(inflate);
                            BOM bom = new BOM(A0L, null, A0L.getResources().getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height), AbstractC167017dG.A06(A0L), 0, 0, 0, -1, false);
                            C51799Mv3 c51799Mv3 = (C51799Mv3) interfaceC58243Prn;
                            TrackData trackData = c51799Mv3.A01;
                            bom.A04(trackData.AsF(), null);
                            A08.setImageDrawable(bom);
                            String title = trackData.getTitle();
                            String str = "";
                            if (title == null) {
                                title = "";
                            }
                            A0e.setText(title);
                            String displayArtist = trackData.getDisplayArtist();
                            if (displayArtist != null) {
                                str = displayArtist;
                            }
                            A0e2.setText(str);
                            A0e3.setText(C84963qk.A03(AbstractC166997dE.A0M(A0L), Integer.valueOf(c51799Mv3.A00)));
                            if (i3 != AbstractC25226BEj.A05(list)) {
                                inflate.setPadding(0, 0, AbstractC167017dG.A0E(A0L), 0);
                            }
                            ViewOnClickListenerC55468OkN.A00(inflate, 6, o46, interfaceC58243Prn);
                            viewGroup.addView(inflate);
                            i3 = i4;
                        }
                    }
                    return;
                }
                throw C00O.createAndThrow();
            }
            String str2 = this.A07;
            C51264Mkn c51264Mkn = (C51264Mkn) c3oo;
            C14360o3.A0B(c51264Mkn, 1);
            if (str2 == null) {
                return;
            }
            c51264Mkn.A00.setText(str2);
            return;
        }
        InterfaceC58059Pok interfaceC58059Pok = this.A06;
        Reel reel = (Reel) this.A02.get(i - i2);
        AbstractC54132NwU.A00(this.A03, this.A04, reel, interfaceC58059Pok, (C51322Mlj) c3oo, false);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(994094444);
        List list = this.A02;
        int size = list.size();
        int i = 1;
        int i2 = 1;
        if (this.A00 == null) {
            i2 = 0;
        }
        boolean A1b = AbstractC166987dD.A1b(list);
        int i3 = size + i2;
        if (!this.A01) {
            i = A1b ? 1 : 0;
        }
        int i4 = i3 + i;
        C0f9.A0A(773636327, A03);
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r0.isEmpty() == false) goto L7;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    @Override // X.C2UU, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemViewType(int r5) {
        /*
            r4 = this;
            r0 = -1617509201(0xffffffff9f96c4af, float:-6.3852857E-20)
            int r3 = X.C0f9.A03(r0)
            java.util.List r0 = r4.A00
            r2 = 1
            boolean r1 = X.AbstractC167007dF.A1W(r0)
            if (r5 >= r1) goto L21
            if (r0 == 0) goto L19
            boolean r0 = r0.isEmpty()
            r2 = 3
            if (r0 != 0) goto L1a
        L19:
            r2 = 2
        L1a:
            r0 = -1666544054(0xffffffff9caa8e4a, float:-1.1286437E-21)
            X.C0f9.A0A(r0, r3)
            return r2
        L21:
            java.util.List r0 = r4.A02
            int r0 = r0.size()
            int r0 = r0 + r1
            if (r5 >= r0) goto L2c
            r2 = 0
            goto L1a
        L2c:
            boolean r0 = r4.A01
            if (r0 == 0) goto L1a
            r2 = 4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51175MjJ.getItemViewType(int):int");
    }
}
