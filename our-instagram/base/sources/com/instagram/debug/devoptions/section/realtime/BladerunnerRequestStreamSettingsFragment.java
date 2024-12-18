package com.instagram.debug.devoptions.section.realtime;

import X.AbstractC12190kN;
import X.AbstractC16490ru;
import X.AbstractC167007dF;
import X.AbstractC16960so;
import X.AbstractC31175DnJ;
import X.AbstractC33235ElU;
import X.AbstractC60492pY;
import X.AnonymousClass001;
import X.C0f9;
import X.C0fJ;
import X.C0r5;
import X.C14360o3;
import X.C17280tP;
import X.C69487VoA;
import X.C69797Vvh;
import X.GHY;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.MSY;
import X.UD9;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import kotlin.enums.EnumEntries;

/* loaded from: classes11.dex */
public final class BladerunnerRequestStreamSettingsFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes11.dex */
    public final class RealTimeSandboxConfigSourceKey {
        public static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* synthetic */ RealTimeSandboxConfigSourceKey[] $VALUES;
        public static final RealTimeSandboxConfigSourceKey BLADERUNNER = new RealTimeSandboxConfigSourceKey("BLADERUNNER", 0);
        public static final RealTimeSandboxConfigSourceKey DISTILLERY = new RealTimeSandboxConfigSourceKey("DISTILLERY", 1);
        public static final RealTimeSandboxConfigSourceKey WWW = new RealTimeSandboxConfigSourceKey("WWW", 2);

        public static final /* synthetic */ RealTimeSandboxConfigSourceKey[] $values() {
            return new RealTimeSandboxConfigSourceKey[]{BLADERUNNER, DISTILLERY, WWW};
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        static {
            RealTimeSandboxConfigSourceKey[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC12190kN.A00($values);
        }

        public static RealTimeSandboxConfigSourceKey valueOf(String str) {
            return (RealTimeSandboxConfigSourceKey) Enum.valueOf(RealTimeSandboxConfigSourceKey.class, str);
        }

        public static RealTimeSandboxConfigSourceKey[] values() {
            return (RealTimeSandboxConfigSourceKey[]) $VALUES.clone();
        }

        public RealTimeSandboxConfigSourceKey(String str, int i) {
        }
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, "Bladerunner RequestStream");
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "bladerunner_requeststream_settings";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        generateView();
    }

    /* loaded from: classes11.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RealTimeSandboxConfigSourceKey.values().length];
            try {
                MSY.A1I(RealTimeSandboxConfigSourceKey.BLADERUNNER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                MSY.A1J(RealTimeSandboxConfigSourceKey.DISTILLERY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MSY.A1K(RealTimeSandboxConfigSourceKey.WWW, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void generateView() {
        C17280tP.A4E.A00();
        setItems(AbstractC16960so.A1Q(getMenuItem("Override WWW Host", "od.12345 / www.od.12345.facebook.com / <unixname>.sb", "Sets \"www_sandbox\" header (for FBGQLS)\nControls where Bladerunner finds WWW\nCommon overrides are:\nod.12345\nwww.od.12345.facebook.com\n<unixname>.sb\nLeave blank for default", RealTimeSandboxConfigSourceKey.WWW), getMenuItem("Override Distillery Host", "xxxxx.od.fbinfra.net:8086", "Sets \"distillery_osandbox\" header (for IGGQLS)\nControls where Bladerunner finds Distillery\nCommon overrides are:\nxxxxx.od.fbinfra.net:8086\nLeave blank for default", RealTimeSandboxConfigSourceKey.DISTILLERY), getMenuItem("Override Bladerunner Host", "xxxxx.od.fbinfra.net:18295", "Sets \"OverrideServer\" header\nControls where Warpgate/Stargate finds Bladerunnner\nCommon overrides are:\nxxxxx.od.fbinfra.net:18295\ndevvmXXXXX.vll0.facebook.com:18295\nLeave blank for default", RealTimeSandboxConfigSourceKey.BLADERUNNER)));
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return (UserSession) this.session$delegate.getValue();
    }

    private final GHY getMenuItem(String str, String str2, String str3, final RealTimeSandboxConfigSourceKey realTimeSandboxConfigSourceKey) {
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(1);
        final SearchEditText searchEditText = new SearchEditText(requireContext(), null, 0);
        searchEditText.setHint(str2);
        searchEditText.setText(getValueForSandboxOverride(realTimeSandboxConfigSourceKey));
        searchEditText.setInputType(1);
        searchEditText.setPadding(4, 4, 4, 4);
        linearLayout.addView(searchEditText);
        IgTextView igTextView = new IgTextView(requireContext());
        igTextView.setText(str3);
        igTextView.setPadding(12, 12, 12, 12);
        igTextView.setTextColor(Color.parseColor("#999999"));
        linearLayout.addView(igTextView);
        C69797Vvh c69797Vvh = new C69797Vvh(requireContext());
        c69797Vvh.A08(str);
        C69487VoA c69487VoA = c69797Vvh.A01;
        c69797Vvh.A07(linearLayout);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.section.realtime.BladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BladerunnerRequestStreamSettingsFragment.this.setValueForSandboxOverride(realTimeSandboxConfigSourceKey, "");
                BladerunnerRequestStreamSettingsFragment.this.generateView();
            }
        };
        c69487VoA.A0E = c69487VoA.A0L.getText(2131958304);
        c69487VoA.A02 = onClickListener;
        c69797Vvh.A04(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.section.realtime.BladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BladerunnerRequestStreamSettingsFragment.this.setValueForSandboxOverride(realTimeSandboxConfigSourceKey, AbstractC167007dF.A0g(searchEditText));
                BladerunnerRequestStreamSettingsFragment.this.generateView();
            }
        }, 2131961124);
        final UD9 A00 = c69797Vvh.A00();
        Context requireContext = requireContext();
        String valueForSandboxOverride = getValueForSandboxOverride(realTimeSandboxConfigSourceKey);
        if (valueForSandboxOverride.length() == 0) {
            valueForSandboxOverride = "(default)";
        }
        return new GHY(requireContext, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.realtime.BladerunnerRequestStreamSettingsFragment$getMenuItem$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(2003556564);
                C0fJ.A00(UD9.this);
                C0f9.A0C(719921263, A05);
            }
        }, AbstractC16490ru.A0q(AnonymousClass001.A0u(str, "\n      |", valueForSandboxOverride, "\n    "), "|"));
    }

    private final String getValueForSandboxOverride(RealTimeSandboxConfigSourceKey realTimeSandboxConfigSourceKey) {
        String bladerunnerSandbox;
        int ordinal = realTimeSandboxConfigSourceKey.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    bladerunnerSandbox = C0r5.A01.A00().getWwwSandbox();
                } else {
                    throw new RuntimeException();
                }
            } else {
                bladerunnerSandbox = C0r5.A01.A00().getDistillerySandbox();
            }
        } else {
            bladerunnerSandbox = C0r5.A01.A00().getBladerunnerSandbox();
        }
        if (bladerunnerSandbox == null) {
            return "";
        }
        return bladerunnerSandbox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValueForSandboxOverride(RealTimeSandboxConfigSourceKey realTimeSandboxConfigSourceKey, String str) {
        int ordinal = realTimeSandboxConfigSourceKey.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    C0r5.A01.A00().setWwwSandbox(str);
                    return;
                }
                throw new RuntimeException();
            }
            C0r5.A01.A00().setDistillerySandbox(str);
            return;
        }
        C0r5.A01.A00().setBladerunnerSandbox(str);
    }
}
