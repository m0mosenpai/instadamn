package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.archive.fragment.ArchiveReelCalendarFragment;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.ArEffectPickerRecyclerView;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.music.search.MusicOverlayResultsListController;
import com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel;

/* renamed from: X.Mji, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51198Mji extends C1I4 {
    public final int A00;
    public final Object A01;

    public C51198Mji(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(RecyclerView recyclerView, Object obj, int i) {
        recyclerView.A14(new C51198Mji(obj, i));
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03;
        int i2;
        IgLiveViewerLikesViewModel igLiveViewerLikesViewModel;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(-157057666);
                if (i == 1) {
                    ArchiveReelCalendarFragment.A02((ArchiveReelCalendarFragment) this.A01);
                }
                i2 = -108514031;
                break;
            case 2:
                A03 = C0f9.A03(844211303);
                C14360o3.A0B(recyclerView, 0);
                OyC oyC = (OyC) this.A01;
                if (oyC.AFk()) {
                    oyC.A0B.A01();
                }
                if (oyC.A06) {
                    i2 = 510765791;
                    break;
                } else {
                    if (i != 0) {
                        if (i == 1) {
                            oyC.A0C.A01 = false;
                        }
                    } else {
                        oyC.A0A.post(oyC.A0E);
                        Object obj = oyC.A0D.A00.first;
                        C14360o3.A07(obj);
                        if ((obj == EnumC1810181d.A11 || obj == EnumC1810181d.A0y) && oyC.A03 != null) {
                            int A00 = AbstractC226529zA.A00(recyclerView);
                            oyC.A00 = A00;
                            ArEffectPickerRecyclerView arEffectPickerRecyclerView = oyC.A03;
                            if (arEffectPickerRecyclerView != null) {
                                arEffectPickerRecyclerView.A0n(A00);
                            } else {
                                IllegalStateException A0g = AbstractC166997dE.A0g();
                                C0f9.A0A(-1106677610, A03);
                                throw A0g;
                            }
                        }
                    }
                    i2 = -764259693;
                    break;
                }
                break;
            case 5:
                A03 = C0f9.A03(1414026667);
                C14360o3.A0B(recyclerView, 0);
                super.onScrollStateChanged(recyclerView, i);
                FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A01;
                if (followersShareFragment.isVisible()) {
                    if (i != 0) {
                        if (i == 1) {
                            FollowersShareFragment.A0L(followersShareFragment, false);
                        }
                    } else {
                        FollowersShareFragment.A0L(followersShareFragment, true);
                    }
                }
                i2 = 733051682;
                break;
            case 9:
                A03 = AbstractC167017dG.A0N(recyclerView, -1488598308);
                super.onScrollStateChanged(recyclerView, i);
                boolean z = true;
                if (i == 1) {
                    N6U.A03((N6U) this.A01);
                }
                N6U n6u = (N6U) this.A01;
                if (i != 2) {
                    z = false;
                }
                n6u.A0G = z;
                i2 = 778920951;
                break;
            case 10:
                A03 = AbstractC167017dG.A0N(recyclerView, -8410248);
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    MusicOverlayResultsListController musicOverlayResultsListController = (MusicOverlayResultsListController) this.A01;
                    if (musicOverlayResultsListController.A00 == 0) {
                        musicOverlayResultsListController.A06();
                    }
                    if (musicOverlayResultsListController.A0A() && musicOverlayResultsListController.A0B()) {
                        MusicOverlayResultsListController.A03(musicOverlayResultsListController);
                    }
                }
                ((MusicOverlayResultsListController) this.A01).A00 = i;
                i2 = 1903233902;
                break;
            case 14:
                A03 = AbstractC167017dG.A0N(recyclerView, 1982563144);
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    C51018MgQ A02 = ((OMQ) this.A01).A02();
                    if ((A02 instanceof IgLiveViewerLikesViewModel) && (igLiveViewerLikesViewModel = (IgLiveViewerLikesViewModel) A02) != null) {
                        IgLiveViewerLikesViewModel.A05(igLiveViewerLikesViewModel);
                    }
                }
                i2 = 144620957;
                break;
            default:
                super.onScrollStateChanged(recyclerView, i);
                return;
        }
        C0f9.A0A(i2, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if ((r2.A0U() - r2.A1d()) > 3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r2.A1d() != (r2.A0U() - 2)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0196, code lost:
    
        if (r1.A02 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a7, code lost:
    
        X.N6t.A00(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a5, code lost:
    
        if (r1.A02 != false) goto L72;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1I4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51198Mji.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
