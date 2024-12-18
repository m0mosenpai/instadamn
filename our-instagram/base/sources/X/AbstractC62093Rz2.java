package X;

import com.facebook.forker.Process;

/* renamed from: X.Rz2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62093Rz2 {
    public static String A00(int i) {
        if (i == 12) {
            return "STASH_GET_RESOURCE";
        }
        if (i == 13) {
            return "STASH_INSERT";
        }
        if (i == 29) {
            return "STASH_READ_RESOURCE";
        }
        if (i == 30) {
            return "STASH_WRITE";
        }
        switch (i) {
            case Process.SIGTERM /* 15 */:
                return "STASH_STASH_INSERT";
            case 33:
                return "STASH_GET_ITEM_COUNT";
            case 1100:
                return "INSERT_VIDEOCACHE_LOGGING";
            case 1223:
                return "GET_SIZE_BYTES_IG_IMAGES";
            case 1565:
                return "GET_ALL_KEYS_GRAPH_SERVICE_CACHE";
            case 1934:
                return "READ_RESOURCE_POOL_CACHE_METADATA";
            case 2235:
                return "STASH_TOUCH";
            case 2252:
                return "WRITE_IMAGES";
            case 2289:
                return "GET_RESOURCE_IMAGES";
            case 2496:
                return "INSERT_GRAPH_SERVICE_CACHE";
            case 2972:
                return "INSERT_IMAGES";
            case 3129:
                return "INSERT_ARD_FACETRACKER";
            case 3548:
                return "WRITE_VIDEOCACHE_LOGGING";
            case 3576:
                return "GET_RESOURCE_RAS_BLOBS";
            case 4069:
                return "READ_RESOURCE_DATAFETCH_NETWORK_FETCH_DISK_CACHE";
            case 4238:
                return "GET_ALL_KEYS_RAS_BLOBS";
            case 4371:
                return "INSERT_DATAFETCH_NETWORK_FETCH_DISK_CACHE";
            case 4431:
                return "GET_ALL_KEYS_IG_RAS_BLOBS";
            case 5262:
                return "GET_ALL_KEYS_IMAGES";
            case 5341:
                return "REMOVE_RAS_BLOBS";
            case 5458:
                return "GET_RESOURCE_GRAPH_SERVICE_CACHE";
            case 5639:
                return "REMOVE_ALL_IMAGES";
            case 5824:
                return "REMOVE_IG_RAS_BLOBS";
            case 5976:
                return "WRITE_IG_IMAGES";
            case 6636:
                return "READ_RESOURCE_VIDEOCACHE_LOGGING";
            case 6860:
                return "GET_RESOURCE_IG_IMAGES";
            case 6870:
                return "INSERT_IG_RAS_BLOBS";
            case 6972:
                return "INSERT_POOL_CACHE_METADATA";
            case 7475:
                return "GET_RESOURCE_DATAFETCH_NETWORK_FETCH_DISK_CACHE";
            case 7690:
                return "GET_RESOURCE_ARD_FACETRACKER";
            case 8103:
                return "READ_RESOURCE_IMAGES";
            case 8136:
                return "INSERT_RAS_BLOBS";
            case 8424:
                return "WRITE_POOL_CACHE_METADATA";
            case 8660:
                return "GET_ITEM_COUNT_IG_IMAGES";
            case 8671:
                return "REMOVE_VIDEOCACHE_LOGGING";
            case 9377:
                return "REMOVE_DATAFETCH_NETWORK_FETCH_DISK_CACHE";
            case 9951:
                return "GET_ALL_KEYS_IG_GRAPH_SERVICES";
            case 10418:
                return "GET_RESOURCE_IG_RAS_BLOBS";
            case 10669:
                return "GET_RESOURCE_VIDEOCACHE_LOGGING";
            case 10720:
                return "REMOVE_POOL_CACHE_METADATA";
            case 10948:
                return "INSERT_IG_GRAPH_SERVICES";
            case 10998:
                return "REMOVE_IMAGES";
            case 11053:
                return "READ_RESOURCE_IG_IMAGES";
            case 12705:
                return "WRITE_DATAFETCH_NETWORK_FETCH_DISK_CACHE";
            case 12870:
                return "REMOVE_GRAPH_SERVICE_CACHE";
            case 13364:
                return "GET_ALL_KEYS_POOL_CACHE_METADATA";
            case 13933:
                return "GET_ALL_KEYS_DATAFETCH_NETWORK_FETCH_DISK_CACHE";
            case 14247:
                return "GET_RESOURCE_IG_GRAPH_SERVICES";
            case 14621:
                return "GET_RESOURCE_POOL_CACHE_METADATA";
            case 15233:
                return "REMOVE_ALL_IG_IMAGES";
            case 16053:
                return "REMOVE_IG_GRAPH_SERVICES";
            case 16138:
                return "GET_ALL_KEYS_IG_IMAGES";
            case 16209:
                return "INSERT_IG_IMAGES";
            case 16283:
                return "GET_ALL_KEYS_ARD_FACETRACKER";
            case 16373:
                return "REMOVE_IG_IMAGES";
            default:
                switch (i) {
                    case Process.SIGSTOP /* 19 */:
                        return "STASH_REMOVE";
                    case 20:
                        return "STASH_HAS_KEY";
                    case 21:
                        return "STASH_GET_ALL_KEYS";
                    case 22:
                        return "STASH_GET_SIZE_BYTES";
                    case 23:
                        return "STASH_REMOVE_ALL";
                    case 24:
                        return "STASH_CREATE_STASH";
                    case 25:
                        return "STASH_CREATE_STASH_MANAGER";
                    case 26:
                        return "STASH_APP_HEARTBEAT";
                    case 27:
                        return "STASH_APP_BACKGROUND";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
