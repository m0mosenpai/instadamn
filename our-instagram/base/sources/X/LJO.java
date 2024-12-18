package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.armadilloexpress.transportpayload.Collection;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.Thumbnail;
import com.instagram.direct.armadilloexpress.transportpayload.Video;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LJO {
    public static final C910143t createGenericFBAttachment(Media media, List list, C83403nh c83403nh, UserSession userSession, C45040JwV c45040JwV) {
        CommonMediaTransport commonMediaTransport;
        String str;
        String A0u;
        String str2;
        GifUrlImpl gifUrlImpl;
        int i;
        int i2;
        SimpleImageUrl simpleImageUrl;
        long j;
        long j2;
        Video A0O;
        float f;
        String str3;
        boolean A1b = AbstractC25233BEq.A1b(media, list, c83403nh);
        C14360o3.A0B(userSession, 3);
        if (media.mediaCase_ == 3) {
            commonMediaTransport = media.A0O().mediaTransport_;
        } else {
            commonMediaTransport = media.A0N().mediaTransport_;
        }
        if (commonMediaTransport == null) {
            commonMediaTransport = CommonMediaTransport.DEFAULT_INSTANCE;
        }
        String str4 = commonMediaTransport.mediaId_;
        C14360o3.A0A(str4);
        if (list.size() > 3) {
            C83693oE A0U = c83403nh.A0U();
            if (A0U != null) {
                str3 = A0U.A00;
            } else {
                str3 = null;
            }
            A0u = AnonymousClass001.A13("instagram://direct_media_collection?collection_type=stacks&thread_id=", str3, "&collection_id=", c83403nh.A0h(), "&client_context=", c83403nh.A0g());
        } else {
            if (media.mediaCase_ == 3) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            A0u = AnonymousClass001.A0u("instagram://media_viewer?is_video=", str, "&media_fbid=", str4);
        }
        C38321qM A03 = LL2.A03(userSession, null, media, c83403nh.A0M().A00, c83403nh.A1S());
        android.net.Uri A01 = LLT.A01(c45040JwV, media);
        if (A01 == null || (str2 = A01.toString()) == null) {
            str2 = "";
        }
        if (media.mediaCase_ == 3) {
            float f2 = 0.0f;
            if (A03 != null) {
                f = A03.A0z();
                f2 = A03.A0y();
            } else {
                f = 0.0f;
            }
            gifUrlImpl = new GifUrlImpl(str2, f, f2);
        } else {
            gifUrlImpl = null;
        }
        if (media.mediaCase_ == 3 && (A0O = media.A0O()) != null && (A0O.bitField0_ & 8) != 0) {
            Thumbnail thumbnail = A0O.thumbnail_;
            if (thumbnail == null) {
                thumbnail = Thumbnail.DEFAULT_INSTANCE;
            }
            C14360o3.A07(thumbnail);
            CommonMediaTransport commonMediaTransport2 = thumbnail.mediaTransport_;
            if (commonMediaTransport2 == null) {
                commonMediaTransport2 = CommonMediaTransport.DEFAULT_INSTANCE;
            }
            C14360o3.A07(commonMediaTransport2);
            simpleImageUrl = new SimpleImageUrl(AbstractC166987dD.A19(LLT.A00(c45040JwV, commonMediaTransport2, null)), thumbnail.width_, thumbnail.height_);
        } else {
            if (A03 != null) {
                i = A03.A0z();
                i2 = A03.A0y();
            } else {
                i = 0;
                i2 = 0;
            }
            simpleImageUrl = new SimpleImageUrl(str2, i, i2);
        }
        int i3 = 0;
        if (media.mediaCase_ == 3) {
            i3 = 2;
        }
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        C14360o3.A0B(str4, 0);
        Long A0k = AbstractC003100w.A0k(10, str4);
        if (A0k != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        Long A0k2 = AbstractC003100w.A0k(10, str4);
        if (A0k2 != null) {
            j2 = A0k2.longValue();
        } else {
            j2 = 0;
        }
        return new C910143t(simpleImageUrl, enumC910243u, gifUrlImpl, A0u, i3, 9, j, j2, A1b);
    }

    public static final void A00(UserSession userSession, Collection collection, C83403nh c83403nh, Long l, String str) {
        C45040JwV c45040JwV;
        AbstractC167017dG.A1P(userSession, collection);
        String A0g = c83403nh.A0g();
        if (str != null && A0g != null) {
            c45040JwV = new C45040JwV(l, str, A0g, c83403nh.C8i(), c83403nh.A1d());
        } else {
            c45040JwV = null;
        }
        addCollectionData(c83403nh, collection, userSession, c45040JwV);
    }

    public static final Object addCollectionData(C83403nh c83403nh, Collection collection, UserSession userSession, C45040JwV c45040JwV) {
        AbstractC167027dH.A12(c83403nh, collection, userSession);
        List collectionData = getCollectionData(c83403nh, collection, userSession, c45040JwV);
        if (collectionData != null) {
            c83403nh.A18(C2EY.A0z, collectionData);
            return collectionData;
        }
        return new AnonymousClass570("need_update");
    }

    public static final List getCollectionData(C83403nh c83403nh, Collection collection, UserSession userSession, C45040JwV c45040JwV) {
        int ordinal;
        AbstractC167027dH.A12(c83403nh, collection, userSession);
        if (!AbstractC162597Pw.A01(c83403nh, userSession.userId) && (ordinal = c83403nh.A0M().A00.ordinal()) != 0) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (ordinal == 1 ? !C18U.A06(c06090Tz, userSession, 2342166737341984313L) : C18U.A06(c06090Tz, userSession, 36322809005550242L)) {
                return null;
            }
        }
        InterfaceC65691TsD interfaceC65691TsD = collection.media_;
        ArrayList A10 = AbstractC31174DnI.A10(interfaceC65691TsD);
        Iterator<E> it = interfaceC65691TsD.iterator();
        while (it.hasNext()) {
            A10.add(createGenericFBAttachment((Media) it.next(), interfaceC65691TsD, c83403nh, userSession, c45040JwV));
        }
        return A10;
    }
}
