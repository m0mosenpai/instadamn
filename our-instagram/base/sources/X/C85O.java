package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.google.common.collect.ImmutableList;

/* renamed from: X.85O, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C85O {
    public final String A00;
    public final C85N A01;

    public final void A00(final C85Q c85q) {
        C85N c85n = this.A01;
        C85R.A00(c85n.A00, c85n.A01).A01(new C85T() { // from class: X.85S
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // X.C85T
            public final void DTk(C150156pL c150156pL) {
                VersionedCapability versionedCapability;
                String str = this.A00;
                switch (str.hashCode()) {
                    case -1789211468:
                        if (str.equals("body_tracking")) {
                            versionedCapability = VersionedCapability.BodyTracking;
                            break;
                        }
                        throw new UnsupportedOperationException(AnonymousClass001.A0R("unsupported type ", str));
                    case -1681773391:
                        if (str.equals("scene_understanding")) {
                            versionedCapability = VersionedCapability.SceneUnderstanding;
                            break;
                        }
                        throw new UnsupportedOperationException(AnonymousClass001.A0R("unsupported type ", str));
                    case -1328151599:
                        if (str.equals("multitask_people_segmentation")) {
                            versionedCapability = VersionedCapability.MultitaskPeopleSegmentation;
                            break;
                        }
                        throw new UnsupportedOperationException(AnonymousClass001.A0R("unsupported type ", str));
                    case -841600645:
                        if (str.equals("semantic_segmentation")) {
                            versionedCapability = VersionedCapability.SkySegmentation;
                            break;
                        }
                        throw new UnsupportedOperationException(AnonymousClass001.A0R("unsupported type ", str));
                    case -725598077:
                        if (str.equals("video_highlights")) {
                            versionedCapability = VersionedCapability.VideoHighlights;
                            break;
                        }
                        throw new UnsupportedOperationException(AnonymousClass001.A0R("unsupported type ", str));
                    case -259294581:
                        if (str.equals("enlighten_gan")) {
                            versionedCapability = VersionedCapability.EnlightenGAN;
                            break;
                        }
                        throw new UnsupportedOperationException(AnonymousClass001.A0R("unsupported type ", str));
                    case -181213831:
                        if (str.equals("hand_gesture")) {
                            versionedCapability = VersionedCapability.HandGesture;
                            break;
                        }
                        throw new UnsupportedOperationException(AnonymousClass001.A0R("unsupported type ", str));
                    case 1849486134:
                        if (str.equals("igreels_xray")) {
                            versionedCapability = VersionedCapability.IGReelsXRay;
                            break;
                        }
                        throw new UnsupportedOperationException(AnonymousClass001.A0R("unsupported type ", str));
                    case 1940272554:
                        if (str.equals("saliency")) {
                            versionedCapability = VersionedCapability.Saliency;
                            break;
                        }
                        throw new UnsupportedOperationException(AnonymousClass001.A0R("unsupported type ", str));
                    default:
                        throw new UnsupportedOperationException(AnonymousClass001.A0R("unsupported type ", str));
                }
                c150156pL.A03(c85q, ImmutableList.of((Object) versionedCapability), false);
            }
        }, EnumC142606cM.A01);
    }

    public C85O(C85N c85n, String str) {
        this.A00 = str;
        this.A01 = c85n;
    }
}
