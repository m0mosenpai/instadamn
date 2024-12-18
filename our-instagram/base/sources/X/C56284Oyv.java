package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oyv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56284Oyv implements InterfaceC58283Psb {
    public int A00;
    public RecyclerView A01;
    public C51141Mik A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final C50986Mft A06;
    public final C50858Mdp A07;
    public final ClipsCreationViewModel A08;
    public final C187358Sd A09;
    public final C87H A0A;
    public final Context A0B;
    public final C87D A0C;
    public final NIW A0D;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC58283Psb
    public final void COD(ViewGroup viewGroup) {
        RecyclerView A0B = AbstractC43592JPx.A0B(viewGroup, R.id.clips_stacked_timeline_volume_controls);
        if (A0B != null) {
            this.A01 = A0B;
        } else {
            viewGroup.removeAllViews();
            this.A01 = new C51382Mmh(viewGroup.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                recyclerView.setId(R.id.clips_stacked_timeline_volume_controls);
                RecyclerView recyclerView2 = this.A01;
                if (recyclerView2 != null) {
                    viewGroup.addView(recyclerView2, layoutParams);
                }
            }
            C14360o3.A0F("volumeSliderRecyclerView");
            throw C00O.createAndThrow();
        }
        RecyclerView recyclerView3 = this.A01;
        if (recyclerView3 != null) {
            C3F1 c3f1 = recyclerView3.A0C;
            C14360o3.A0C(c3f1, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((C3F0) c3f1).A00 = false;
            RecyclerView recyclerView4 = this.A01;
            if (recyclerView4 != null) {
                AbstractC31174DnI.A16(viewGroup.getContext(), recyclerView4, 1, false);
                C51141Mik c51141Mik = new C51141Mik(this.A0B, new OKE(this), A00(), AbstractC54867OOc.A01(this.A0C.A0E()));
                this.A02 = c51141Mik;
                RecyclerView recyclerView5 = this.A01;
                if (recyclerView5 != null) {
                    recyclerView5.setAdapter(c51141Mik);
                    C50858Mdp c50858Mdp = this.A07;
                    AbstractC25232BEp.A1J(c50858Mdp, PZJ.A01(this, null, 36), c50858Mdp.A02);
                    return;
                }
            }
        }
        C14360o3.A0F("volumeSliderRecyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final Integer A01(C56284Oyv c56284Oyv) {
        int i;
        AbstractC187378Sf A0E = c56284Oyv.A09.A0E();
        if ((A0E instanceof C8TB) && (i = ((C8TB) A0E).A00) != -1) {
            return Integer.valueOf(i);
        }
        return null;
    }

    private final String A02() {
        C51737MtK c51737MtK;
        C51832Mva A0M;
        C51676Ms7 c51676Ms7;
        AbstractC187378Sf A0E = this.A09.A0E();
        if (!(A0E instanceof C8TB) || (c51737MtK = ((C8TB) A0E).A01) == null || (A0M = this.A0D.A0M(c51737MtK.A01, c51737MtK.A00)) == null || (c51676Ms7 = A0M.A08) == null) {
            return null;
        }
        return c51676Ms7.A08;
    }

    @Override // X.InterfaceC58283Psb
    public final void AJN() {
        if (this.A02 != null) {
            this.A04 = true;
            A03();
            C51141Mik c51141Mik = this.A02;
            if (c51141Mik == null) {
                C14360o3.A0F("volumeSliderAdapter");
                throw C00O.createAndThrow();
            }
            c51141Mik.A01 = null;
        }
    }

    @Override // X.InterfaceC58283Psb
    public final void AQM(float f) {
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            C14360o3.A0F("volumeSliderRecyclerView");
            throw C00O.createAndThrow();
        }
        recyclerView.scrollBy(0, (int) f);
    }

    @Override // X.InterfaceC58283Psb
    public final int B91() {
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            C14360o3.A0F("volumeSliderRecyclerView");
            throw C00O.createAndThrow();
        }
        return recyclerView.computeVerticalScrollRange();
    }

    @Override // X.InterfaceC58283Psb
    public final boolean CRk() {
        String str;
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            str = "volumeSliderRecyclerView";
        } else {
            if (!recyclerView.canScrollVertically(1)) {
                return true;
            }
            C51141Mik c51141Mik = this.A02;
            if (c51141Mik == null) {
                str = "volumeSliderAdapter";
            } else {
                if (c51141Mik.getItemCount() <= 1) {
                    return true;
                }
                return false;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58283Psb
    public final boolean CRl() {
        String str;
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            str = "volumeSliderRecyclerView";
        } else {
            if (!AbstractC43592JPx.A1X(recyclerView)) {
                return true;
            }
            C51141Mik c51141Mik = this.A02;
            if (c51141Mik == null) {
                str = "volumeSliderAdapter";
            } else {
                if (c51141Mik.getItemCount() <= 1) {
                    return true;
                }
                return false;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58283Psb
    public final void D0G() {
        if (this.A03) {
            this.A03 = false;
        } else if (this.A04) {
            this.A04 = false;
        } else {
            A03();
        }
    }

    @Override // X.InterfaceC58283Psb
    public final void DHV(float f, float f2) {
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            C14360o3.A0F("volumeSliderRecyclerView");
            throw C00O.createAndThrow();
        }
        recyclerView.A1E(0, (int) f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0125, code lost:
    
        X.C14360o3.A0F("volumeSliderAdapter");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010e, code lost:
    
        throw X.C00O.createAndThrow();
     */
    @Override // X.InterfaceC58283Psb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cancel() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56284Oyv.cancel():void");
    }

    public C56284Oyv(Context context, UserSession userSession, C50986Mft c50986Mft, C50858Mdp c50858Mdp, C87D c87d, ClipsCreationViewModel clipsCreationViewModel, C187358Sd c187358Sd, NIW niw, C87H c87h) {
        AbstractC167017dG.A1R(userSession, c50858Mdp);
        this.A0B = context;
        this.A05 = userSession;
        this.A07 = c50858Mdp;
        this.A0C = c87d;
        this.A09 = c187358Sd;
        this.A08 = clipsCreationViewModel;
        this.A0D = niw;
        this.A0A = c87h;
        this.A06 = c50986Mft;
    }

    private final O2A A00() {
        if (A01(this) != null) {
            return new NIH(String.valueOf(A01(this)));
        }
        if (A02() != null) {
            return new NIG(A02());
        }
        C187358Sd c187358Sd = this.A09;
        AbstractC187378Sf A0E = c187358Sd.A0E();
        if ((A0E instanceof C8TB) && ((C8TB) A0E).A03 != null) {
            return NIL.A00;
        }
        AbstractC187378Sf A0E2 = c187358Sd.A0E();
        if ((A0E2 instanceof C8TB) && ((C8TB) A0E2).A02 != null) {
            return NIJ.A00;
        }
        return null;
    }

    private final void A03() {
        C115475Kh c115475Kh;
        HashMap A1G = AbstractC166987dD.A1G();
        C51141Mik c51141Mik = this.A02;
        if (c51141Mik != null) {
            for (C51631MrO c51631MrO : c51141Mik.A00) {
                O2A o2a = c51631MrO.A03;
                if (o2a instanceof NIG) {
                    String str = c51631MrO.A08;
                    if (str != null) {
                        A1G.put(str, Float.valueOf(AbstractC54867OOc.A00(c51631MrO.A00)));
                    }
                    C51141Mik c51141Mik2 = this.A02;
                    if (c51141Mik2 == null) {
                        C14360o3.A0F("volumeSliderAdapter");
                        throw C00O.createAndThrow();
                    }
                    List list = c51141Mik2.A00;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj : list) {
                        if (((C51631MrO) obj).A03 instanceof NIG) {
                            A1E.add(obj);
                        }
                    }
                    if (A1E.size() == 1) {
                        this.A0C.A0F(AbstractC54867OOc.A00(c51631MrO.A00));
                    }
                } else if (o2a instanceof NIL) {
                    this.A0C.A0I(AbstractC54867OOc.A00(c51631MrO.A00));
                } else if (o2a instanceof NIJ) {
                    this.A0C.A0H(AbstractC54867OOc.A00(c51631MrO.A00));
                } else if (o2a instanceof NIH) {
                    float A00 = AbstractC54867OOc.A00(c51631MrO.A00);
                    Integer A01 = A01(this);
                    if (A01 != null) {
                        int intValue = A01.intValue();
                        C84G c84g = this.A08.A0O;
                        AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) ((C84B) c84g.A03.getValue()).A04(intValue);
                        if (abstractC115485Ki != null) {
                            AbstractC115485Ki A06 = abstractC115485Ki.A06();
                            if ((A06 instanceof C115475Kh) && (c115475Kh = (C115475Kh) A06) != null) {
                                c115475Kh.A01 = A00;
                                c84g.A01(c115475Kh, intValue);
                            }
                        }
                    } else {
                        this.A0C.A01.A06(A00);
                    }
                } else if (o2a instanceof NII) {
                    this.A0C.A0G(AbstractC54867OOc.A00(c51631MrO.A00));
                } else if (o2a instanceof NIK) {
                    this.A06.A02.A07(c51631MrO.A00);
                }
                if (!A1G.isEmpty()) {
                    this.A08.A0K.A0B(A1G);
                }
            }
        }
    }

    public static final void A04(C56284Oyv c56284Oyv, List list, float f) {
        if (A01(c56284Oyv) != null) {
            list.add(AbstractC166987dD.A1L(AbstractC166997dE.A0v(A01(c56284Oyv), AbstractC166997dE.A11("video_audio_")), Float.valueOf(f * c56284Oyv.A0C.A0E())));
            return;
        }
        ClipsCreationViewModel clipsCreationViewModel = c56284Oyv.A08;
        C0UO c0uo = clipsCreationViewModel.A0c;
        if (((C84B) c0uo.getValue()).A01.isEmpty()) {
            return;
        }
        int A06 = MSW.A06((C84B) c0uo.getValue());
        for (int i = 0; i < A06; i++) {
            Float A0H = clipsCreationViewModel.A0H(i);
            if (A0H != null) {
                list.add(AbstractC166987dD.A1L(AnonymousClass001.A0O("video_audio_", i), Float.valueOf(A0H.floatValue() * f)));
            }
        }
    }

    public static void A05(Object obj, AbstractMap abstractMap, float f) {
        abstractMap.put(obj, Float.valueOf(AbstractC54867OOc.A01(f)));
    }

    @Override // X.InterfaceC58283Psb
    public final List Ben() {
        if (A00() == null && this.A00 > 1) {
            return AbstractC16960so.A1Q(EnumC53256Ngu.A08, EnumC53256Ngu.A09, EnumC53256Ngu.A04);
        }
        return AbstractC166987dD.A1J(EnumC53256Ngu.A07);
    }

    @Override // X.InterfaceC58283Psb
    public final void DhM() {
        float f;
        int intValue;
        Float A0H;
        HashMap A1G = AbstractC166987dD.A1G();
        NIH nih = new NIH(null);
        C87D c87d = this.A0C;
        A05(nih, A1G, c87d.A0E());
        NIL nil = NIL.A00;
        ClipsAudioStore clipsAudioStore = c87d.A01;
        A05(nil, A1G, MSY.A00(clipsAudioStore.A0n));
        Integer A01 = A01(this);
        if (A01 != null && (A0H = this.A08.A0H((intValue = A01.intValue()))) != null) {
            A05(new NIH(String.valueOf(intValue)), A1G, A0H.floatValue());
        }
        List A1B = MSW.A1B(this.A08.A0K.A0V);
        if (A1B != null) {
            Iterator it = A1B.iterator();
            while (it.hasNext()) {
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) ((AbstractC193598he) it.next()).A01;
                if (audioOverlayTrack != null) {
                    A05(new NIG(audioOverlayTrack.A0D), A1G, audioOverlayTrack.A00);
                }
            }
        }
        A05(NII.A00, A1G, MSY.A00(clipsAudioStore.A0g));
        A05(NIJ.A00, A1G, MSY.A00(clipsAudioStore.A0i));
        NIK nik = NIK.A00;
        C190178bb c190178bb = (C190178bb) this.A06.A02.A0b.getValue();
        if (c190178bb != null) {
            f = c190178bb.A00;
        } else {
            f = 0.0f;
        }
        A1G.put(nik, Float.valueOf(f));
        C51141Mik c51141Mik = this.A02;
        if (c51141Mik == null) {
            C14360o3.A0F("volumeSliderAdapter");
            throw C00O.createAndThrow();
        }
        c51141Mik.A01 = A1G;
    }
}
