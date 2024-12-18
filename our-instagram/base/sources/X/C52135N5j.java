package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.widget.progressbar.ClipsReviewProgressBar;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* renamed from: X.N5j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52135N5j extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ClipsTrimFragment";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Surface A05;
    public TextureView A06;
    public View A07;
    public ViewGroup A08;
    public C51700MsV A09;
    public IgImageView A0A;
    public C54671OCx A0B;
    public C8RS A0C;
    public C50648MXm A0D;
    public InterfaceC58267PsB A0E;
    public C8R0 A0F;
    public C8RR A0G;
    public C9TN A0H;
    public ClipsReviewProgressBar A0I;
    public C187318Ry A0J;
    public LoadingSpinnerView A0K;
    public C49602Pt A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public ConstraintLayout A0P;
    public C183378Bk A0Q;
    public final int A0R;
    public final C9L6 A0S;
    public final C56278Oyn A0T;
    public final Runnable A0U;
    public final InterfaceC09390do A0V;
    public final InterfaceC09390do A0W;
    public final InterfaceC09390do A0X;
    public final InterfaceC09390do A0Y = AbstractC60492pY.A02(this);
    public final InterfaceC58111Ppa A0Z;
    public final InterfaceC187208Rn A0a;
    public final InterfaceC187288Rv A0b;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_trim_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A0X;
        C51033Mgh c51033Mgh = (C51033Mgh) interfaceC09390do.getValue();
        c51033Mgh.A01.Egh(EnumC53131Nek.A02);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do2 = this.A0Y;
        this.A0Q = AbstractC183368Bj.A00(requireContext, AbstractC166987dD.A0r(interfaceC09390do2));
        Context requireContext2 = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do2);
        AbstractC167017dG.A1N(requireContext2, A0r);
        this.A0L = C2Ps.A00(requireContext2, A0r);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.clips_review_parent_container);
        this.A08 = viewGroup;
        if (viewGroup != null) {
            this.A0I = (ClipsReviewProgressBar) viewGroup.findViewById(R.id.clips_review_progress_bar);
            ViewGroup viewGroup2 = this.A08;
            if (viewGroup2 != null) {
                this.A07 = viewGroup2.findViewById(R.id.clips_play_button);
                ViewGroup viewGroup3 = this.A08;
                if (viewGroup3 != null) {
                    this.A0K = (LoadingSpinnerView) viewGroup3.findViewById(R.id.clips_review_spinner);
                    ViewGroup viewGroup4 = this.A08;
                    if (viewGroup4 != null) {
                        this.A0A = AbstractC31172DnG.A0a(viewGroup4, R.id.clips_review_loading_thumbnail);
                        ViewGroup viewGroup5 = this.A08;
                        if (viewGroup5 != null) {
                            this.A0D = new C50648MXm(AbstractC31176DnK.A0C(viewGroup5, R.id.clips_review_play_mode), this.A0Z);
                            ViewGroup viewGroup6 = this.A08;
                            if (viewGroup6 != null) {
                                this.A0P = (ConstraintLayout) viewGroup6.requireViewById(R.id.video_review_trim_mode);
                                C56267Oyc c56267Oyc = new C56267Oyc(this);
                                this.A0F = c56267Oyc;
                                ConstraintLayout constraintLayout = this.A0P;
                                if (constraintLayout == null) {
                                    str = "reviewTrimModeView";
                                } else {
                                    this.A0G = new C8RR(constraintLayout, this, AbstractC166987dD.A0r(interfaceC09390do2), c56267Oyc, (C8JS) this.A0V.getValue(), this.A0L);
                                    C50648MXm c50648MXm = this.A0D;
                                    if (c50648MXm == null) {
                                        str = "clipsReviewPlayMode";
                                    } else {
                                        this.A0C = c50648MXm;
                                        FragmentActivity requireActivity = requireActivity();
                                        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do2);
                                        ViewGroup viewGroup7 = this.A08;
                                        if (viewGroup7 != null) {
                                            TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) AbstractC166997dE.A0S(viewGroup7, R.id.clips_edit_thumbnail_tray);
                                            C9L6 c9l6 = this.A0S;
                                            this.A0J = new C187318Ry(requireActivity, null, this, A0r2, touchInterceptorFrameLayout, null, c9l6, this.A0b, null, null, MXW.A00, C187308Rx.A00, 0.5625f, 2131961124, 1, AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size), AbstractC167017dG.A0A(requireContext()), R.color.black_60_transparent, R.dimen.abc_button_inset_vertical_material, false, true, true, false, false, false);
                                            C51700MsV c51700MsV = this.A09;
                                            if (c51700MsV == null) {
                                                str = "trimData";
                                            } else {
                                                C8RR c8rr = this.A0G;
                                                str = "clipsReviewTrimMode";
                                                if (c8rr != null) {
                                                    Integer num = (Integer) c51700MsV.A05;
                                                    C14360o3.A0B(num, 0);
                                                    c8rr.A02 = num;
                                                    C195868lW c195868lW = (C195868lW) c51700MsV.A07;
                                                    if (c195868lW != null && AbstractC166987dD.A0H(c51700MsV.A05) == 4) {
                                                        ((C51033Mgh) interfaceC09390do.getValue()).A00 = AbstractC55154OdI.A00(AbstractC23035ADr.A00(c195868lW, this.A0R, 1), C51033Mgh.A01(interfaceC09390do));
                                                        this.A04 = C51033Mgh.A00(interfaceC09390do) - 1;
                                                        C8RR c8rr2 = this.A0G;
                                                        if (c8rr2 != null) {
                                                            this.A0C = c8rr2;
                                                        }
                                                    }
                                                    Integer valueOf = Integer.valueOf(c51700MsV.A01);
                                                    Integer valueOf2 = Integer.valueOf(this.A04);
                                                    C8RR c8rr3 = this.A0G;
                                                    if (c8rr3 != null) {
                                                        A02(c8rr3, this, c195868lW, valueOf, null, null, valueOf2);
                                                        c9l6.A96(this.A0a);
                                                        ((C87G) AbstractC31175DnJ.A0A(this).A00(C87G.class)).A00("trim").A09.A06(this, new C151846sU(new MY1(this, 8)));
                                                        C07S c07s = C07S.STARTED;
                                                        C07X viewLifecycleOwner = getViewLifecycleOwner();
                                                        AbstractC166987dD.A1Z(new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 26), C07Y.A00(viewLifecycleOwner));
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C14360o3.A0F(str);
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("clipsReviewContainer");
        throw C00O.createAndThrow();
    }

    public static final TargetViewSizeProvider A00(C52135N5j c52135N5j) {
        C51700MsV c51700MsV = c52135N5j.A09;
        if (c51700MsV == null) {
            C14360o3.A0F("trimData");
            throw C00O.createAndThrow();
        }
        return (TargetViewSizeProvider) c51700MsV.A06;
    }

    public static final void A01(C54671OCx c54671OCx, C52135N5j c52135N5j) {
        int i;
        String str;
        if (c52135N5j.A0E == null) {
            c52135N5j.A03 = -1;
            return;
        }
        c52135N5j.A0B = c54671OCx;
        int i2 = c54671OCx.A01;
        int i3 = c54671OCx.A00;
        if (c52135N5j.A06 != null) {
            ViewGroup viewGroup = c52135N5j.A08;
            if (viewGroup == null) {
                str = "clipsReviewContainer";
            } else {
                AbstractC13880nE.A0q(viewGroup, new PSR(c52135N5j, i2, i3));
                int i4 = c52135N5j.A03;
                if (i4 != -1) {
                    i = c52135N5j.A0T.BsQ(i4);
                    c52135N5j.A03 = -1;
                } else {
                    i = c52135N5j.A01;
                }
                InterfaceC58267PsB interfaceC58267PsB = c52135N5j.A0E;
                if (interfaceC58267PsB != null) {
                    C54671OCx c54671OCx2 = c52135N5j.A0B;
                    if (c54671OCx2 != null) {
                        interfaceC58267PsB.ESu(c54671OCx2, i);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                InterfaceC58267PsB interfaceC58267PsB2 = c52135N5j.A0E;
                if (interfaceC58267PsB2 != null) {
                    interfaceC58267PsB2.EYI(new C56265Oya(c52135N5j));
                }
                View view = c52135N5j.A07;
                if (view == null) {
                    str = "playButton";
                } else {
                    view.setVisibility(8);
                    InterfaceC58267PsB interfaceC58267PsB3 = c52135N5j.A0E;
                    if (interfaceC58267PsB3 == null) {
                        return;
                    }
                    interfaceC58267PsB3.start();
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A02(C8RR c8rr, C52135N5j c52135N5j, C195868lW c195868lW, Integer num, Integer num2, Integer num3, Integer num4) {
        Object value;
        int i;
        int i2;
        int i3;
        int i4;
        C8RR c8rr2;
        C05A c05a = ((C51033Mgh) c52135N5j.A0X.getValue()).A02;
        do {
            value = c05a.getValue();
            C51619MrC c51619MrC = (C51619MrC) value;
            if (num != null) {
                i = num.intValue();
            } else {
                i = c51619MrC.A02;
            }
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = c51619MrC.A01;
            }
            if (num3 != null) {
                i3 = num3.intValue();
            } else {
                i3 = c51619MrC.A00;
            }
            if (num4 != null) {
                i4 = num4.intValue();
            } else {
                i4 = c51619MrC.A03;
            }
            if (c8rr == null) {
                c8rr2 = c51619MrC.A04;
            } else {
                c8rr2 = c8rr;
            }
        } while (!c05a.AIi(value, new C51619MrC(c8rr2, c195868lW, i, i2, i3, i4)));
    }

    public static final void A03(C52135N5j c52135N5j, int i) {
        int A00;
        if (c52135N5j.A0E != null && c52135N5j.A0B != null) {
            InterfaceC09390do interfaceC09390do = c52135N5j.A0X;
            int A002 = C51033Mgh.A00(interfaceC09390do) - 1;
            InterfaceC58267PsB interfaceC58267PsB = c52135N5j.A0E;
            if (interfaceC58267PsB != null) {
                int currentPosition = interfaceC58267PsB.getCurrentPosition();
                if (currentPosition <= 0) {
                    A00 = C51033Mgh.A00(interfaceC09390do) - 1;
                } else {
                    A00 = NsX.A00(c52135N5j.A0T, currentPosition);
                }
                int A03 = AbstractC13600mm.A03(i + A00, 0, A002);
                if (A03 != A00 || A03 == 0 || A03 == A002) {
                    InterfaceC58267PsB interfaceC58267PsB2 = c52135N5j.A0E;
                    if (interfaceC58267PsB2 != null) {
                        interfaceC58267PsB2.seekTo(c52135N5j.A0T.BsQ(A03));
                    }
                    AbstractC50523MSb.A0f();
                    C50648MXm c50648MXm = c52135N5j.A0D;
                    if (c50648MXm == null) {
                        C14360o3.A0F("clipsReviewPlayMode");
                        throw C00O.createAndThrow();
                    }
                    int A003 = C51033Mgh.A00(interfaceC09390do);
                    c50648MXm.A00 = A03;
                    c50648MXm.A01 = A003;
                    C50648MXm.A00(c50648MXm);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A04(C52135N5j c52135N5j, int i, int i2, int i3) {
        String str;
        ClipsReviewProgressBar clipsReviewProgressBar = c52135N5j.A0I;
        if (clipsReviewProgressBar == null) {
            str = "reviewProgressBar";
        } else {
            clipsReviewProgressBar.setPlaybackPosition(i);
            C8RS c8rs = c52135N5j.A0C;
            if (c8rs == null) {
                str = "currentReviewMode";
            } else {
                C50648MXm c50648MXm = c52135N5j.A0D;
                str = "clipsReviewPlayMode";
                if (c50648MXm != null) {
                    if (c8rs == c50648MXm) {
                        C9L6 c9l6 = c52135N5j.A0S;
                        if (i2 != c9l6.A00 && i2 < c9l6.A01.size()) {
                            C187318Ry c187318Ry = c52135N5j.A0J;
                            if (c187318Ry == null) {
                                str = "thumbnailTrayController";
                            } else {
                                c187318Ry.A09(i2);
                                C50648MXm c50648MXm2 = c52135N5j.A0D;
                                if (c50648MXm2 != null) {
                                    c50648MXm2.A00 = i2;
                                    c50648MXm2.A01 = i3;
                                    C50648MXm.A00(c50648MXm2);
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A05() {
        ViewGroup viewGroup = this.A08;
        if (viewGroup == null) {
            C14360o3.A0F("clipsReviewContainer");
            throw C00O.createAndThrow();
        }
        viewGroup.removeCallbacks(this.A0U);
        InterfaceC58267PsB interfaceC58267PsB = this.A0E;
        if (interfaceC58267PsB != null) {
            interfaceC58267PsB.release();
            this.A0E = null;
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0Y);
    }

    public C52135N5j() {
        C0YZ A1D = AbstractC25225BEi.A1D(C51033Mgh.class);
        this.A0X = AbstractC25225BEi.A0a(new B5y(this, 6), new B5y(this, 7), new C57256Pbe(32, null, this), A1D);
        this.A0W = AbstractC25225BEi.A0a(new B5y(this, 8), C57346Pd6.A00, new C57256Pbe(33, null, this), AbstractC25225BEi.A1D(C8K5.class));
        this.A0V = AbstractC25225BEi.A0a(new B5y(this, 10), new B5y(this, 5), new C57256Pbe(34, null, this), AbstractC25225BEi.A1D(C8JS.class));
        this.A0U = new PM6(this);
        this.A0T = new C56278Oyn(this);
        this.A0S = new C9L6();
        this.A0R = 90000;
        this.A03 = -1;
        this.A00 = Integer.MAX_VALUE;
        this.A0a = new C56318Ozf(this);
        this.A0b = new C56319Ozg();
        this.A0Z = new OyY();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A05();
        InterfaceC09390do interfaceC09390do = this.A0X;
        if (!C51033Mgh.A01(interfaceC09390do).A01.isEmpty()) {
            C51033Mgh c51033Mgh = (C51033Mgh) interfaceC09390do.getValue();
            C84B c84b = (C84B) AbstractC55154OdI.A04(C51033Mgh.A01(interfaceC09390do)).A00;
            C14360o3.A0B(c84b, 0);
            c51033Mgh.A00 = c84b;
        }
        AbstractC31174DnI.A0I(this).A0b();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-2137249705);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Medium medium = (Medium) requireArguments.getParcelable("import_video_medium");
        int i2 = requireArguments.getInt("import_video_width");
        int i3 = requireArguments.getInt("import_video_height");
        int i4 = requireArguments.getInt("import_video_orientation");
        if (medium != null) {
            boolean z = requireArguments.getBoolean("import_video_was_photo");
            String string = requireArguments.getString(AbstractC111324zv.A00(5392));
            C195868lW c195868lW = new C195868lW(medium, i2, i3, i4);
            c195868lW.A1L = z;
            c195868lW.A0r = string;
            c195868lW.A07 = requireArguments.getInt("full_video_duration");
            TargetViewSizeProvider targetViewSizeProvider = (TargetViewSizeProvider) requireArguments.getParcelable("target_view_size_provider");
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) requireArguments.getParcelable(AbstractC111324zv.A00(742));
            if (targetViewSizeProvider != null) {
                this.A09 = new C51700MsV(targetViewSizeProvider, audioOverlayTrack, c195868lW, C05F.A0Y, requireArguments.getInt("max_capture_duration_in_ms"), requireArguments.getInt("segment_and_pending_media_count"), requireArguments.getInt("remaining_realtime_duration_in_ms"));
                C0f9.A09(317554338, A02);
                return;
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 1777077915;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -1516895351;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1324298381);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_clips_review_container, false);
        C0f9.A09(1341879706, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(777256462);
        C51033Mgh c51033Mgh = (C51033Mgh) this.A0X.getValue();
        c51033Mgh.A01.Egh(EnumC53131Nek.A03);
        super.onDestroy();
        C0f9.A09(-1689262525, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1733831340);
        super.onPause();
        InterfaceC58267PsB interfaceC58267PsB = this.A0E;
        if (interfaceC58267PsB != null) {
            interfaceC58267PsB.pause();
        }
        C0f9.A09(-1952815195, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(953123523);
        super.onResume();
        InterfaceC58267PsB interfaceC58267PsB = this.A0E;
        if (interfaceC58267PsB != null) {
            interfaceC58267PsB.start();
        }
        C0f9.A09(-1750382223, A02);
    }
}
