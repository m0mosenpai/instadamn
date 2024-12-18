package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import java.util.List;

/* loaded from: classes9.dex */
public final class N6Q extends AbstractC59962oe implements InterfaceC60072op, InterfaceC193788hy {
    public static final String __redex_internal_original_name = "StoryDraftsFragment";
    public C194148iZ A00;
    public C54736OFn A01;
    public InterfaceC59892oW A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06 = AbstractC25225BEi.A0a(new B8P(this, 30), new B8P(this, 35), new C57257Pbf(44, null, this), AbstractC25225BEi.A1D(C188848Ya.class));

    @Override // X.InterfaceC193788hy
    public final void DpK(Bitmap bitmap, String str) {
        C14360o3.A0B(str, 1);
        C8XO c8xo = (C8XO) this.A03.getValue();
        MSX.A1A(c8xo.A04, new C206409Bx(bitmap, str));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "stories_drafts";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        PIP pip = new PIP(view, 1);
        this.A02 = pip;
        C57982lB.A0B.A04(requireActivity, pip, false);
        C54736OFn c54736OFn = new C54736OFn(view);
        this.A01 = c54736OFn;
        String str = "viewHolder";
        c54736OFn.A02.setVisibility(0);
        C54736OFn c54736OFn2 = this.A01;
        if (c54736OFn2 != null) {
            C184708Hl Csh = c54736OFn2.A0D.Csh();
            Csh.A00 = new C56250Oxx(this, 1);
            Csh.A00();
            C54736OFn c54736OFn3 = this.A01;
            if (c54736OFn3 != null) {
                AnonymousClass834 anonymousClass834 = c54736OFn3.A0F;
                C194148iZ c194148iZ = this.A00;
                if (c194148iZ == null) {
                    str = "storyDraftsAdapter";
                } else {
                    boolean z = c194148iZ.A02;
                    int i = 2131961177;
                    if (z) {
                        i = 2131961176;
                    }
                    anonymousClass834.A00(AbstractC25227BEk.A0v(this, i));
                    C54736OFn c54736OFn4 = this.A01;
                    if (c54736OFn4 != null) {
                        C184708Hl Csh2 = c54736OFn4.A0F.Csh();
                        Csh2.A00 = new C56250Oxx(this, 2);
                        Csh2.A00();
                        C54736OFn c54736OFn5 = this.A01;
                        if (c54736OFn5 != null) {
                            c54736OFn5.A09.setText(2131974611);
                            C54736OFn c54736OFn6 = this.A01;
                            if (c54736OFn6 != null) {
                                c54736OFn6.A0A.setText(2131974608);
                                C54736OFn c54736OFn7 = this.A01;
                                if (c54736OFn7 != null) {
                                    c54736OFn7.A08.setImageResource(R.drawable.instagram_new_story_outline_96);
                                    C54736OFn c54736OFn8 = this.A01;
                                    if (c54736OFn8 != null) {
                                        AbstractC31172DnG.A1B(requireContext(), c54736OFn8.A05, AbstractC53242c7.A0H(getContext(), R.attr.igds_color_media_background));
                                        C54736OFn c54736OFn9 = this.A01;
                                        if (c54736OFn9 != null) {
                                            Ok3.A00(c54736OFn9.A05, 1, this);
                                            C54736OFn c54736OFn10 = this.A01;
                                            if (c54736OFn10 != null) {
                                                AbstractC31172DnG.A1B(requireContext(), c54736OFn10.A01, AbstractC53242c7.A0H(getContext(), R.attr.igds_color_reels_tab_bar_separator));
                                                C54736OFn c54736OFn11 = this.A01;
                                                if (c54736OFn11 != null) {
                                                    c54736OFn11.A06.setLayoutManager(new GridLayoutManager(getContext(), 3));
                                                    int A0C = AbstractC166987dD.A0C(requireContext(), 2);
                                                    C54736OFn c54736OFn12 = this.A01;
                                                    if (c54736OFn12 != null) {
                                                        c54736OFn12.A06.A10(new C195638l4(A0C, false));
                                                        int dimensionPixelSize = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
                                                        C54736OFn c54736OFn13 = this.A01;
                                                        if (c54736OFn13 != null) {
                                                            c54736OFn13.A06.setPadding(0, 0, 0, dimensionPixelSize * 2);
                                                            C54736OFn c54736OFn14 = this.A01;
                                                            if (c54736OFn14 != null) {
                                                                c54736OFn14.A06.setClipToPadding(false);
                                                                C54736OFn c54736OFn15 = this.A01;
                                                                if (c54736OFn15 != null) {
                                                                    AbstractC56932jR.A06(c54736OFn15.A0C, 500L);
                                                                    A01(this, 0);
                                                                    C194148iZ c194148iZ2 = this.A00;
                                                                    str = "storyDraftsAdapter";
                                                                    if (c194148iZ2 != null) {
                                                                        C54736OFn c54736OFn16 = this.A01;
                                                                        if (c54736OFn16 != null) {
                                                                            RecyclerView recyclerView = c54736OFn16.A06;
                                                                            C14360o3.A0B(recyclerView, 0);
                                                                            c194148iZ2.A00 = new L40(c194148iZ2.A04, AbstractC25225BEi.A16(recyclerView));
                                                                            C54736OFn c54736OFn17 = this.A01;
                                                                            if (c54736OFn17 != null) {
                                                                                RecyclerView recyclerView2 = c54736OFn17.A06;
                                                                                C194148iZ c194148iZ3 = this.A00;
                                                                                if (c194148iZ3 != null) {
                                                                                    recyclerView2.setAdapter(c194148iZ3.A08.A01);
                                                                                    C07S c07s = C07S.STARTED;
                                                                                    C07X viewLifecycleOwner = getViewLifecycleOwner();
                                                                                    AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 38), C07Y.A00(viewLifecycleOwner));
                                                                                    return;
                                                                                }
                                                                            }
                                                                        }
                                                                        C14360o3.A0F("viewHolder");
                                                                        throw C00O.createAndThrow();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(N6Q n6q) {
        String str;
        C194148iZ c194148iZ = n6q.A00;
        if (c194148iZ != null) {
            c194148iZ.A02(!c194148iZ.A02);
            C54736OFn c54736OFn = n6q.A01;
            if (c54736OFn == null) {
                str = "viewHolder";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            AnonymousClass834 anonymousClass834 = c54736OFn.A0F;
            C194148iZ c194148iZ2 = n6q.A00;
            if (c194148iZ2 != null) {
                boolean z = c194148iZ2.A02;
                int i = 2131961177;
                if (z) {
                    i = 2131961176;
                }
                anonymousClass834.A00(AbstractC25227BEk.A0v(n6q, i));
                return;
            }
        }
        str = "storyDraftsAdapter";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(N6Q n6q, int i) {
        C54736OFn c54736OFn = n6q.A01;
        if (c54736OFn != null) {
            View view = c54736OFn.A00;
            int visibility = view.getVisibility();
            if (i > 0) {
                if (visibility == 8) {
                    AbstractC125325le A0o = AbstractC43592JPx.A0o(view, 0);
                    A0o.A0T(AbstractC166987dD.A08(view), 0.0f);
                    A0o.A04 = 0;
                    A0o.A0F(true).A0H();
                }
                C54736OFn c54736OFn2 = n6q.A01;
                if (c54736OFn2 != null) {
                    AbstractC31177DnL.A0r(n6q.requireContext(), c54736OFn2.A05, Integer.valueOf(i), 2131974607);
                    return;
                }
            } else {
                if (visibility != 0) {
                    return;
                }
                AbstractC125325le A0o2 = AbstractC43592JPx.A0o(view, 0);
                A0o2.A0K(AbstractC166987dD.A08(view));
                A0o2.A03 = 8;
                A0o2.A0F(true).A0H();
                return;
            }
        }
        C14360o3.A0F("viewHolder");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        ((C8XO) this.A03.getValue()).A00(C8XI.A04);
        return true;
    }

    public N6Q() {
        B8P b8p = new B8P(this, 34);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new B8P(new B8P(this, 31), 32));
        this.A05 = AbstractC25225BEi.A0a(new B8P(A00, 33), b8p, new C57257Pbf(45, null, A00), AbstractC25225BEi.A1D(StoryDraftsCreationViewModel.class));
        this.A03 = AbstractC09440dt.A01(new B8P(this, 29));
        this.A04 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1692787579);
        super.onCreate(bundle);
        setModuleNameV2("stories_drafts");
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A04;
        interfaceC09390do.getValue();
        int A022 = MSW.A02(AbstractC188868Yc.A02(requireContext), 0.5625f);
        Context requireContext2 = requireContext();
        interfaceC09390do.getValue();
        int A023 = AbstractC188868Yc.A02(requireContext2);
        Context requireContext3 = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C188898Yf c188898Yf = new C188898Yf(AbstractC166987dD.A0r(interfaceC09390do), A023, A022);
        OyV oyV = new OyV(this);
        InterfaceC09390do interfaceC09390do2 = this.A06;
        this.A00 = new C194148iZ(requireContext3, A0r, c188898Yf, this, oyV, "stories_drafts", (List) ((C188848Ya) interfaceC09390do2.getValue()).A01.getValue());
        ((C188848Ya) interfaceC09390do2.getValue()).A00(requireContext());
        AbstractC43593JPy.A0T(interfaceC09390do).A0a();
        C0f9.A09(-466895151, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-16273883);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_media_drafts_fragment, false);
        C0f9.A09(304284413, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2087361760);
        super.onDestroyView();
        FragmentActivity requireActivity = requireActivity();
        InterfaceC59892oW interfaceC59892oW = this.A02;
        if (interfaceC59892oW == null) {
            C14360o3.A0F("windowInsetListener");
            throw C00O.createAndThrow();
        }
        C57992lC.A02(requireActivity, interfaceC59892oW);
        C0f9.A09(-711852840, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1311120848);
        super.onResume();
        AbstractC145016gM.A03(requireActivity(), this, AbstractC166987dD.A0r(this.A04), false, false);
        C0f9.A09(-1130003860, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-636556522);
        super.onStop();
        AbstractC145016gM.A04(requireActivity(), AbstractC166987dD.A0r(this.A04), false);
        C0f9.A09(1366008943, A02);
    }
}
