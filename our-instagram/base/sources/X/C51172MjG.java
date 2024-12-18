package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MjG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51172MjG extends C2UU {
    public OKn A00;
    public Integer A01;
    public final C8BN A02;
    public final C22C A03;
    public final InterfaceC58146PqB A04;
    public final String A05;
    public final List A06;
    public final int A07;
    public final ImmutableList A08;
    public final UserSession A09;
    public final Integer A0A;
    public final HashSet A0B;

    public final int A02(AudioOverlayTrack audioOverlayTrack) {
        C14360o3.A0B(audioOverlayTrack, 0);
        OKn A00 = AbstractC53928Nt1.A00(audioOverlayTrack);
        OKn oKn = this.A00;
        this.A00 = A00;
        if (this.A01.intValue() != 1) {
            return 0;
        }
        if (oKn != null) {
            notifyItemChanged(this.A06.indexOf(oKn) + 1);
        }
        int indexOf = this.A06.indexOf(A00) + 1;
        notifyItemChanged(indexOf);
        A00(this, A00);
        return indexOf;
    }

    public final void A04(Collection collection) {
        Number number;
        C14360o3.A0B(collection, 0);
        Integer num = C05F.A00;
        A01(num);
        List list = this.A06;
        ArrayList A0q = AbstractC167017dG.A0q(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            JIN jin = (JIN) it.next();
            C14360o3.A0B(jin, 0);
            List BE6 = jin.BE6();
            int i = 0;
            if (BE6 != null && !BE6.isEmpty() && (number = (Number) AbstractC001800i.A0O(BE6, 0)) != null) {
                i = number.intValue();
            }
            A0q.add(new OKn(jin, num, i, jin.CAB()));
        }
        list.addAll(A0q);
        if (this.A01 == C05F.A01) {
            notifyDataSetChanged();
        }
    }

    public final void A05(Collection collection) {
        Integer num = C05F.A01;
        A01(num);
        ArrayList A0q = AbstractC167017dG.A0q(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC53928Nt1.A00((AudioOverlayTrack) it.next()));
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A0q) {
            OKn oKn = (OKn) obj;
            if (!this.A06.contains(oKn) && oKn.A02.getId() != null) {
                A1E.add(obj);
            }
        }
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            this.A06.add(0, it2.next());
        }
        if (this.A01 == num) {
            notifyDataSetChanged();
        }
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                C51313Mla c51313Mla = (C51313Mla) c3oo;
                c51313Mla.A01.postDelayed(new PMI(c51313Mla), c51313Mla.A00 * i);
                return;
            }
            OKn oKn = (OKn) this.A06.get(i - 1);
            C51295MlI c51295MlI = (C51295MlI) c3oo;
            boolean A0K = C14360o3.A0K(oKn, this.A00);
            C14360o3.A0B(oKn, 0);
            c51295MlI.A00 = oKn;
            JIN jin = oKn.A02;
            String title = jin.getTitle();
            C52363NFb c52363NFb = c51295MlI.A01;
            c52363NFb.setTitle(title);
            c52363NFb.setSubtitle(jin.getDisplayArtist());
            String A0t = AbstractC31174DnI.A0t(c52363NFb.getContext(), title, jin.getDisplayArtist(), 2131974865);
            C14360o3.A07(A0t);
            c52363NFb.setTalkback(A0t);
            ((BOM) c51295MlI.A02.getValue()).A04(jin.AsT(), null);
            c52363NFb.setSelected(A0K);
            return;
        }
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (X.AbstractC43840Ja3.A00(r1) != false) goto L12;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3OO onCreateViewHolder(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            if (r7 == 0) goto L4d
            r0 = 1
            if (r7 == r0) goto L36
            r0 = 2
            if (r7 != r0) goto L2f
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r4 = X.AbstractC166997dE.A0L(r6)
            int r0 = r5.A07
            java.lang.Integer r3 = r5.A0A
            com.instagram.common.session.UserSession r1 = r5.A09
            X.NFb r2 = new X.NFb
            r2.<init>(r4, r1, r3, r0)
            java.lang.Integer r0 = X.C05F.A01
            if (r3 != r0) goto L28
            boolean r1 = X.AbstractC43840Ja3.A00(r1)
            r0 = 1
            if (r1 == 0) goto L29
        L28:
            r0 = 0
        L29:
            X.Mla r1 = new X.Mla
            r1.<init>(r2, r0)
            return r1
        L2f:
            java.lang.String r0 = "Unsupported view type"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L36:
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r4 = X.AbstractC166997dE.A0L(r6)
            int r3 = r5.A07
            java.lang.Integer r2 = r5.A0A
            com.instagram.common.session.UserSession r1 = r5.A09
            X.NFb r0 = new X.NFb
            r0.<init>(r4, r1, r2, r3)
            X.MlI r1 = new X.MlI
            r1.<init>(r5, r0, r2, r3)
            return r1
        L4d:
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r4 = X.AbstractC166997dE.A0L(r6)
            int r3 = r5.A07
            java.lang.Integer r2 = r5.A0A
            com.instagram.common.session.UserSession r1 = r5.A09
            X.NFb r0 = new X.NFb
            r0.<init>(r4, r1, r2, r3)
            X.Mky r1 = new X.Mky
            r1.<init>(r5, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51172MjG.onCreateViewHolder(android.view.ViewGroup, int):X.3OO");
    }

    @Override // X.C2UU
    public final void onViewAttachedToWindow(C3OO c3oo) {
        InterfaceC02590Ai A0f;
        C14360o3.A0B(c3oo, 0);
        int absoluteAdapterPosition = c3oo.getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition > 0) {
            List list = this.A06;
            if (absoluteAdapterPosition < list.size() + 1) {
                long itemId = getItemId(absoluteAdapterPosition);
                if (getItemViewType(absoluteAdapterPosition) == 1 && this.A0B.add(Long.valueOf(itemId))) {
                    C8BN c8bn = this.A02;
                    C22C c22c = this.A03;
                    JIN jin = ((OKn) list.get(absoluteAdapterPosition - 1)).A02;
                    if (c8bn == null) {
                        String str = this.A05;
                        A0f = AbstractC166987dD.A0f(((C22F) c22c).A01, "ig_camera_music_browse_song_impression");
                        if (A0f.isSampled()) {
                            Long A0d = AbstractC167007dF.A0d();
                            try {
                                A0d = Long.valueOf(Long.parseLong(jin.BgD()));
                            } catch (NumberFormatException e) {
                                AbstractC12120kG.A0H("IgCameraLoggerImpl", e);
                            }
                            A0f.A9K("audio_asset_id", A0d);
                            MSW.A1Q(A0f);
                            MSY.A15(A0f, jin);
                            AbstractC50522MSa.A1B(A0f, jin);
                            MSY.A14(A0f, jin);
                            AbstractC167007dF.A11(A0f, c22c);
                            A0f.AAP("category", "suggested_audio_sound_sync");
                            C22M c22m = ((C22F) c22c).A04;
                            MSX.A1F(A0f, c22m);
                            AbstractC50522MSa.A1E(A0f, "camera_session_id", c22m.A0L);
                            AbstractC50522MSa.A1C(A0f, jin);
                            MSZ.A1F(A0f, jin, "browse_session_id", str);
                            AbstractC25233BEq.A17(A0f, "product", AbstractC65993Txo.A00(MusicProduct.A06));
                        } else {
                            return;
                        }
                    } else {
                        String str2 = this.A05;
                        C14360o3.A0B("For you", 2);
                        A0f = AbstractC166987dD.A0f(((C22F) c22c).A01, "ig_camera_music_browse_song_impression");
                        if (A0f.isSampled()) {
                            Long A0d2 = AbstractC167007dF.A0d();
                            try {
                                A0d2 = Long.valueOf(Long.parseLong(jin.BgD()));
                            } catch (NumberFormatException e2) {
                                AbstractC12120kG.A0H("IgCameraLoggerImpl", e2);
                            }
                            A0f.A9K("audio_asset_id", A0d2);
                            MSX.A1E(A0f);
                            MSY.A15(A0f, jin);
                            AbstractC50522MSa.A1B(A0f, jin);
                            MSY.A14(A0f, jin);
                            AbstractC167007dF.A11(A0f, c22c);
                            A0f.AAP("category", "suggested_audio_sound_sync");
                            C22M c22m2 = ((C22F) c22c).A04;
                            MSX.A1F(A0f, c22m2);
                            AbstractC166987dD.A1S(A0f, c22m2.A0L);
                            AbstractC166997dE.A1N(A0f, "event_type", 2);
                            AbstractC50522MSa.A1C(A0f, jin);
                            MSZ.A1F(A0f, jin, "browse_session_id", str2);
                            A0f.A8R(c8bn, "music_browser_entry_point");
                            AbstractC25233BEq.A17(A0f, "product", AbstractC65993Txo.A00(MusicProduct.A0G));
                            MSX.A1C(A0f);
                            A0f.A8R(EnumC203578zI.POST_CAPTURE_AUDIO_BAR, "surface_element");
                            MSZ.A1D(A0f, absoluteAdapterPosition);
                            A0f.AAP("audio_browser_surface", "preview");
                            A0f.AAP("section_name", "For you");
                            A0f.A9K("section_id", AbstractC166997dE.A0j("2282005535164995"));
                        } else {
                            return;
                        }
                    }
                    A0f.Cht();
                }
            }
        }
    }

    public static final void A00(C51172MjG c51172MjG, OKn oKn) {
        OKn oKn2 = c51172MjG.A00;
        if (oKn2 != null) {
            c51172MjG.notifyItemChanged(c51172MjG.A06.indexOf(oKn2) + 1);
        }
        c51172MjG.A00 = oKn;
        InterfaceC58146PqB interfaceC58146PqB = c51172MjG.A04;
        MusicAssetModel A02 = MusicAssetModel.A02(oKn.A02);
        int i = oKn.A01;
        interfaceC58146PqB.CyE(new AudioOverlayTrack(A02, i, Math.min(90000, oKn.A00 - i)));
    }

    private final void A01(Integer num) {
        List list = this.A06;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (((OKn) obj).A03 == num) {
                A1E.add(obj);
            }
        }
        list.removeAll(A1E);
    }

    public final void A03(Integer num) {
        if (this.A01 != num) {
            this.A01 = num;
            notifyDataSetChanged();
        }
    }

    public C51172MjG(C8BN c8bn, UserSession userSession, InterfaceC58146PqB interfaceC58146PqB, Integer num, String str, List list, int i) {
        AbstractC167017dG.A1P(userSession, str);
        this.A09 = userSession;
        this.A05 = str;
        this.A06 = list;
        this.A07 = i;
        this.A04 = interfaceC58146PqB;
        this.A0A = num;
        this.A02 = c8bn;
        this.A01 = C05F.A00;
        int ceil = (int) Math.ceil(4.3d);
        ArrayList A17 = AbstractC25225BEi.A17(ceil);
        for (int i2 = 0; i2 < ceil; i2++) {
            AbstractC166997dE.A1W(A17, i2);
        }
        this.A08 = ImmutableList.copyOf((Collection) A17);
        this.A03 = AnonymousClass229.A01(this.A09);
        this.A0B = AbstractC166987dD.A1H();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int size;
        int A03 = C0f9.A03(-2014594058);
        if (this.A01.intValue() != 1) {
            size = this.A08.size();
        } else {
            size = this.A06.size() + 1;
        }
        C0f9.A0A(-1421843860, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(1288755542);
        int itemViewType = getItemViewType(i);
        long j = 0;
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                j = AbstractC31176DnK.A01(this.A08, i);
            } else {
                Long A0j = AbstractC25231BEo.A0j(0, ((OKn) this.A06.get(i - 1)).A02.BgD());
                if (A0j != null) {
                    j = A0j.longValue();
                }
            }
        }
        C0f9.A0A(-1802706184, A03);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(2078038683);
        int i2 = 2;
        if (this.A01.intValue() == 1) {
            i2 = AbstractC25230BEn.A1Q(i);
        }
        C0f9.A0A(1023792401, A03);
        return i2;
    }
}
