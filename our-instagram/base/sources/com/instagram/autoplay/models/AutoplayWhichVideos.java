package com.instagram.autoplay.models;

import X.AbstractC001800i;
import X.AbstractC09440dt;
import X.AbstractC166997dE;
import X.AbstractC25235BEs;
import X.C14360o3;
import X.InterfaceC09390do;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public interface AutoplayWhichVideos {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final float MINIMUM_VISIBILITY_DEFAULT = 0.2f;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static final float MINIMUM_VISIBILITY_DEFAULT = 0.2f;
        public static final /* synthetic */ Companion $$INSTANCE = new Object();
        public static final InterfaceC09390do LoopingTop$delegate = AbstractC09440dt.A01(AutoplayWhichVideos$Companion$LoopingTop$2.INSTANCE);
        public static final InterfaceC09390do SequentialToCenter$delegate = AbstractC09440dt.A01(AutoplayWhichVideos$Companion$SequentialToCenter$2.INSTANCE);
        public static final InterfaceC09390do SequentialToNext$delegate = AbstractC09440dt.A01(AutoplayWhichVideos$Companion$SequentialToNext$2.INSTANCE);
        public static final InterfaceC09390do Focused$delegate = AbstractC09440dt.A01(AutoplayWhichVideos$Companion$Focused$2.INSTANCE);

        public final AutoplayWhichVideos getFocused() {
            return (AutoplayWhichVideos) Focused$delegate.getValue();
        }

        public final AutoplayWhichVideos getLoopingTop() {
            return (AutoplayWhichVideos) LoopingTop$delegate.getValue();
        }

        public final AutoplayWhichVideos getSequentialToCenter() {
            return (AutoplayWhichVideos) SequentialToCenter$delegate.getValue();
        }

        public final AutoplayWhichVideos getSequentialToNext() {
            return (AutoplayWhichVideos) SequentialToNext$delegate.getValue();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final AutoplayWhichVideos valueOf(String str) {
            InterfaceC09390do interfaceC09390do;
            switch (AbstractC25235BEs.A07(str)) {
                case -225062673:
                    if (str.equals("SequentialToCenter")) {
                        interfaceC09390do = SequentialToCenter$delegate;
                        break;
                    }
                    interfaceC09390do = LoopingTop$delegate;
                    break;
                case 308473357:
                    if (str.equals("SequentialToNext")) {
                        interfaceC09390do = SequentialToNext$delegate;
                        break;
                    }
                    interfaceC09390do = LoopingTop$delegate;
                    break;
                case 973611863:
                    if (str.equals("Focused")) {
                        interfaceC09390do = Focused$delegate;
                        break;
                    }
                    interfaceC09390do = LoopingTop$delegate;
                    break;
                default:
                    interfaceC09390do = LoopingTop$delegate;
                    break;
            }
            return (AutoplayWhichVideos) interfaceC09390do.getValue();
        }
    }

    AutoplayWhichVideoMetadata chooseNextVideoToPlay(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata);

    List chooseNextVideosToPause(List list);

    List combine(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata);

    boolean hasMinimumVisibility(float f);

    /* renamed from: com.instagram.autoplay.models.AutoplayWhichVideos$-CC, reason: invalid class name */
    /* loaded from: classes11.dex */
    public abstract /* synthetic */ class CC {
        public static List $default$chooseNextVideosToPause(AutoplayWhichVideos autoplayWhichVideos, List list) {
            ArrayList A12 = AbstractC166997dE.A12(list, 1);
            for (Object obj : list) {
                AutoplayOnScreenItemWithMetadata onScreenMetadata = ((AutoplayWhichVideoMetadata) obj).getOnScreenMetadata();
                if (onScreenMetadata == null || onScreenMetadata.percentageVisible <= 0.2f) {
                    A12.add(obj);
                }
            }
            return A12;
        }

        public static List $default$combine(AutoplayWhichVideos autoplayWhichVideos, List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
            C14360o3.A0B(list, 1);
            ArrayList A0U = AbstractC001800i.A0U(AbstractC001800i.A0X(list));
            if (autoplayWhichVideoMetadata != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (C14360o3.A0K(((AutoplayWhichVideoMetadata) next).media.getId(), autoplayWhichVideoMetadata.media.getId())) {
                        if (next != null) {
                            A0U.remove(next);
                            A0U.add(autoplayWhichVideoMetadata);
                        }
                    }
                }
            }
            return AbstractC001800i.A0g(A0U, TopLeftComparator.instance);
        }
    }
}
