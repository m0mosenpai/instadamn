package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.Collection;
import com.instagram.direct.armadilloexpress.transportpayload.Link;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.ReceiverFetchXma;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class LIS {
    public static final LIS A00 = new Object();

    public static final void A00(Media media, java.util.Set set) {
        String str;
        int i = media.mediaCase_;
        boolean z = true;
        if (i == 1) {
            str = "PHOTO";
        } else if (i == 5) {
            str = "GIF";
        } else if (i == 3) {
            str = "VIDEO";
        } else {
            if (i != 2) {
                z = false;
            }
            if (z) {
                set.add("AUDIO");
                set.add("EPHEMERAL");
                return;
            }
            if (i == 4) {
                set.add("RAVEN");
                set.add("EPHEMERAL");
                int ordinal = media.A0M().A0L().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 0) {
                                return;
                            } else {
                                throw B4Z.A00();
                            }
                        }
                        str = "RAVEN_PERMANENT";
                    } else {
                        str = "RAVEN_REPLAYABLE";
                    }
                } else {
                    str = "RAVEN_READ_ONCE";
                }
            } else if (i != 6) {
                return;
            } else {
                str = "SHARE_LINK";
            }
        }
        set.add(str);
    }

    public final List A01(AddMessagePayload addMessagePayload, int i) {
        Integer num;
        String str;
        Collection collection;
        Link link;
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        if (addMessagePayload != null) {
            AddMessageContent addMessageContent = addMessagePayload.content_;
            if (addMessageContent == null) {
                addMessageContent = AddMessageContent.DEFAULT_INSTANCE;
            }
            C14360o3.A07(addMessageContent);
            int intValue = addMessageContent.A0O().intValue();
            if (intValue != 4) {
                if (intValue != 6) {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            ReceiverFetchXma A0M = addMessageContent.A0M();
                            C14360o3.A07(A0M);
                            if ((A0M.bitField0_ & 1) != 0) {
                                try {
                                    JSONObject jSONObject = new JSONObject(A0M.contentRef_);
                                    EnumC46252KdU enumC46252KdU = (EnumC46252KdU) EnumHelper.A00(jSONObject.optString(TraceFieldType.ContentType), EnumC46252KdU.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                                    C14360o3.A07(enumC46252KdU);
                                    int ordinal = enumC46252KdU.ordinal();
                                    String str2 = "SHARE_LINK";
                                    if (ordinal == 4) {
                                        A0l.add("SHARE_IG_MEDIA");
                                        A0l.add("SHARE_LINK");
                                        str2 = "SHARE_IG_CLIPS";
                                    } else if (ordinal != 5) {
                                        if (ordinal != 3) {
                                            if (ordinal == 2 || ordinal == 11) {
                                                str2 = "STORY_REPLY";
                                            }
                                        }
                                    } else {
                                        A0l.add("SHARE_IG_MEDIA");
                                    }
                                    A0l.add(str2);
                                } catch (JSONException e) {
                                    C0K8.A0H("ArmadilloExpressProtoTransportTagProcessor", "cannot parse incoming json", e);
                                }
                            }
                        }
                    } else {
                        if (addMessageContent.addMessageContentCase_ == 3) {
                            link = (Link) addMessageContent.addMessageContent_;
                        } else {
                            link = Link.DEFAULT_INSTANCE;
                        }
                        C14360o3.A07(link);
                        if ((link.bitField0_ & 2) != 0) {
                            A0l.add("SHARE_LINK");
                        }
                    }
                } else {
                    if (addMessageContent.addMessageContentCase_ == 7) {
                        collection = (Collection) addMessageContent.addMessageContent_;
                    } else {
                        collection = Collection.DEFAULT_INSTANCE;
                    }
                    C14360o3.A07(collection);
                    if (collection.media_.size() > 0) {
                        for (Media media : collection.media_) {
                            C14360o3.A0A(media);
                            A00(media, A0l);
                        }
                    }
                }
            } else {
                Media A0L = addMessageContent.A0L();
                C14360o3.A07(A0L);
                A00(A0L, A0l);
            }
            AddMessageMetadata addMessageMetadata = addMessagePayload.metadata_;
            if (addMessageMetadata == null) {
                addMessageMetadata = AddMessageMetadata.DEFAULT_INSTANCE;
            }
            C14360o3.A07(addMessageMetadata);
        }
        if (i != 1) {
            if (i == 2) {
                num = C05F.A07;
            }
            return AbstractC001800i.A0a(A0l);
        }
        num = C05F.A05;
        switch (num.intValue()) {
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str = "SHH";
                break;
            case 14:
                str = "STORY_REPLY";
                break;
            default:
                str = "DISAPPEARING_MESSAGE";
                break;
        }
        A0l.add(str);
        return AbstractC001800i.A0a(A0l);
    }
}
