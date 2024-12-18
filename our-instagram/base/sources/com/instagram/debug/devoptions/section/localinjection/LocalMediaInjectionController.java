package com.instagram.debug.devoptions.section.localinjection;

import X.AbstractC167017dG;
import X.AbstractC31171DnF;
import X.C0YR;
import X.C14360o3;
import X.C17280tP;
import X.InterfaceC16530ry;
import android.content.Context;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants;
import java.util.Set;

/* loaded from: classes11.dex */
public final class LocalMediaInjectionController {
    public final C17280tP devPreferences;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalMediaInjectionConstants.InjectionContentType.values().length];
            try {
                iArr[LocalMediaInjectionConstants.InjectionContentType.STORIES_ADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalMediaInjectionConstants.InjectionContentType.STORIES_NETEGO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalMediaInjectionConstants.InjectionContentType.FEED_NETEGO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalMediaInjectionConstants.InjectionContentType.FEED_ADS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalMediaInjectionConstants.InjectionContentType.REELS_ADS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalMediaInjectionConstants.InjectionContentType.REELS_ORGANIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LocalMediaInjectionConstants.InjectionContentType.THREADS_ADS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LocalMediaInjectionController(Context context) {
        C14360o3.A0B(context, 1);
        this.devPreferences = C17280tP.A4E.A01(context);
    }

    public final Set getSelectedInjectionItems(LocalMediaInjectionConstants.InjectionContentType injectionContentType) {
        C17280tP c17280tP;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        char c;
        C14360o3.A0B(injectionContentType, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (injectionContentType.ordinal()) {
            case 0:
                c17280tP = this.devPreferences;
                interfaceC16530ry = c17280tP.A1Q;
                c0yrArr = C17280tP.A4G;
                c = 197;
                break;
            case 1:
                c17280tP = this.devPreferences;
                interfaceC16530ry = c17280tP.A1R;
                c0yrArr = C17280tP.A4G;
                c = 196;
                break;
            case 2:
                c17280tP = this.devPreferences;
                interfaceC16530ry = c17280tP.A1U;
                c0yrArr = C17280tP.A4G;
                c = 194;
                break;
            case 3:
                c17280tP = this.devPreferences;
                interfaceC16530ry = c17280tP.A1V;
                c0yrArr = C17280tP.A4G;
                c = 195;
                break;
            case 4:
                c17280tP = this.devPreferences;
                interfaceC16530ry = c17280tP.A1S;
                c0yrArr = C17280tP.A4G;
                c = 199;
                break;
            case 5:
                c17280tP = this.devPreferences;
                interfaceC16530ry = c17280tP.A1T;
                c0yrArr = C17280tP.A4G;
                c = 200;
                break;
            case 6:
                c17280tP = this.devPreferences;
                interfaceC16530ry = c17280tP.A1W;
                c0yrArr = C17280tP.A4G;
                c = 201;
                break;
            default:
                throw new IllegalStateException();
        }
        return (Set) interfaceC16530ry.CES(c17280tP, c0yrArr[c]);
    }

    public final void selectInjectionItems(Set set, LocalMediaInjectionConstants.InjectionContentType injectionContentType) {
        C17280tP c17280tP;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        AbstractC167017dG.A1N(set, injectionContentType);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (injectionContentType.ordinal()) {
            case 0:
                c17280tP = this.devPreferences;
                interfaceC16530ry = c17280tP.A1Q;
                c0yrArr = C17280tP.A4G;
                i = 197;
                break;
            case 1:
                c17280tP = this.devPreferences;
                interfaceC16530ry = c17280tP.A1R;
                c0yrArr = C17280tP.A4G;
                i = 196;
                break;
            case 2:
                c17280tP = this.devPreferences;
                interfaceC16530ry = c17280tP.A1U;
                c0yrArr = C17280tP.A4G;
                i = 194;
                break;
            case 3:
                c17280tP = this.devPreferences;
                interfaceC16530ry = c17280tP.A1V;
                c0yrArr = C17280tP.A4G;
                i = 195;
                break;
            case 4:
                c17280tP = this.devPreferences;
                interfaceC16530ry = c17280tP.A1S;
                c0yrArr = C17280tP.A4G;
                i = 199;
                break;
            case 5:
                c17280tP = this.devPreferences;
                interfaceC16530ry = c17280tP.A1T;
                c0yrArr = C17280tP.A4G;
                i = 200;
                break;
            case 6:
                c17280tP = this.devPreferences;
                interfaceC16530ry = c17280tP.A1W;
                c0yrArr = C17280tP.A4G;
                i = 201;
                break;
            default:
                throw new IllegalStateException();
        }
        AbstractC31171DnF.A1S(c17280tP, set, interfaceC16530ry, c0yrArr, i);
    }
}
