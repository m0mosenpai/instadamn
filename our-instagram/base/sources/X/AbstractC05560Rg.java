package X;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/* renamed from: X.0Rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05560Rg extends Fragment {
    public View A00;
    public View A01;
    public View A02;
    public ListAdapter A03;
    public ListView A04;
    public TextView A05;
    public boolean A06;
    public final Handler A07 = new Handler();
    public final Runnable A09 = new Runnable() { // from class: X.06x
        @Override // java.lang.Runnable
        public final void run() {
            ListView listView = AbstractC05560Rg.this.A04;
            listView.focusableViewAvailable(listView);
        }
    };
    public final AdapterView.OnItemClickListener A08 = new AdapterView.OnItemClickListener() { // from class: X.06y
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        }
    };

    public static void A00(AbstractC05560Rg abstractC05560Rg) {
        if (abstractC05560Rg.A04 != null) {
            return;
        }
        View view = abstractC05560Rg.mView;
        if (view != null) {
            if (view instanceof ListView) {
                abstractC05560Rg.A04 = (ListView) view;
            } else {
                TextView textView = (TextView) view.findViewById(16711681);
                abstractC05560Rg.A05 = textView;
                if (textView == null) {
                    abstractC05560Rg.A00 = view.findViewById(R.id.empty);
                } else {
                    textView.setVisibility(8);
                }
                abstractC05560Rg.A02 = view.findViewById(16711682);
                abstractC05560Rg.A01 = view.findViewById(16711683);
                View findViewById = view.findViewById(R.id.list);
                if (!(findViewById instanceof ListView)) {
                    if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    }
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                ListView listView = (ListView) findViewById;
                abstractC05560Rg.A04 = listView;
                View view2 = abstractC05560Rg.A00;
                if (view2 != null) {
                    listView.setEmptyView(view2);
                }
            }
            abstractC05560Rg.A06 = true;
            abstractC05560Rg.A04.setOnItemClickListener(abstractC05560Rg.A08);
            ListAdapter listAdapter = abstractC05560Rg.A03;
            if (listAdapter != null) {
                abstractC05560Rg.A03 = null;
                abstractC05560Rg.A0U(listAdapter);
            } else if (abstractC05560Rg.A02 != null) {
                A00(abstractC05560Rg);
                View view3 = abstractC05560Rg.A02;
                if (view3 != null) {
                    if (abstractC05560Rg.A06) {
                        abstractC05560Rg.A06 = false;
                        view3.clearAnimation();
                        abstractC05560Rg.A01.clearAnimation();
                        abstractC05560Rg.A02.setVisibility(0);
                        abstractC05560Rg.A01.setVisibility(8);
                    }
                } else {
                    throw new IllegalStateException("Can't be used with a custom content view");
                }
            }
            abstractC05560Rg.A07.post(abstractC05560Rg.A09);
            return;
        }
        throw new IllegalStateException("Content view not yet created");
    }

    public final void A0U(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = false;
        if (this.A03 != null) {
            z2 = true;
        }
        this.A03 = listAdapter;
        ListView listView = this.A04;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.A06 && !z2) {
                if (requireView().getWindowToken() != null) {
                    z = true;
                }
                A00(this);
                View view = this.A02;
                if (view != null) {
                    if (!this.A06) {
                        this.A06 = true;
                        if (z) {
                            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                            this.A01.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
                        } else {
                            view.clearAnimation();
                            this.A01.clearAnimation();
                        }
                        this.A02.setVisibility(8);
                        this.A01.setVisibility(0);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Can't be used with a custom content view");
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(732328672);
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C0f9.A09(481075429, A02);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(389730494);
        this.A07.removeCallbacks(this.A09);
        this.A04 = null;
        this.A06 = false;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        super.onDestroyView();
        C0f9.A09(749372918, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        A00(this);
    }
}
